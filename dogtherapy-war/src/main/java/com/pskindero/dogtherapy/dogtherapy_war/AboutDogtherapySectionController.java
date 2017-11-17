package com.pskindero.dogtherapy.dogtherapy_war;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutDogtherapySectionController {

	private static final AboutDogtherapySection DEFAULT = new AboutDogtherapySection("Dogoterapia to metoda wspomagająca rehabilitację, edukację, rewalidację, w której bodźcem do podejmowania działań jest odpowiednio przygotowany pies, prowadzony przez wykwalifikowanego terapeutę." +
					"To właśnie ta forma terapii wzbudza w dziecku ogromne emocje. Dzieje się tak dzięki bezinteresowności psa, który nie ocenia, nie krytykuje, ale akceptuje dziecko takim jakie ono jest. Dzieci aby zaspokoić swoją naturalną ciekawość podążają za psem, okazują mu zainteresowanie. Bezpośredni kontakt z żywym zwierzęciem zaspokaja potrzeby dziecka: potrzebę dotyku, czułości, bliskości. Dzięki zabawie z psem, nieświadomie w odczuciu dziecka, prowadzimy specjalistyczną rehabilitację, ukierunkowaną indywidualnie na jego potrzeby.",
                    "Leczenie przy pomocy psów ma za zadanie wspomagać rehabilitację, psychoterapię oraz edukację pacjentów. Chorzy współpracujący z psami najczęściej cierpią na zespół downa, mózgowe porażenie dziecięce  czy różnorodne zaburzenia emocjonalne takie jak lęk przed otoczeniem lub nadpobudliwość.dogoterapia, dogoterapeuta, leczenie dzieci Taka forma terapii jest uzależniona od relacji pomiędzy psem, a pacjentem. Osoba niepełnosprawna pracując ze zwierzęciem uczy się brania odpowiedzialności za niego poprzez karmienie go, wychodzenie z nim czy po prostu zabawę. W przypadku dzieci, dogoterapia jest też świetnym sposobem na „ukrycie” żmudnych ćwiczeń pod osłoną rozrywki z psem. Ponadto dziecko chętniej chce uczęszczać na zajęcia oraz jest pozytywnie nastawione do rehabilitacji. Co ciekawe popularne czworonogi pomagają nie tylko dzieciom czy osobom starszym, ale również odwiedzają hospicja, a nawet ośrodki wychowawcze i karne, gdzie z pewnością wpływają na dobrą atmosferę." +
                    "Z oczywistych powodów w dogoterapii nie wezmą udziału osoby uczulone na ślinę lub sierść psa. Mogą zdarzyć się również agresywnego zachowania pacjenta wobec psów bądź braku jakiekolwiek zainteresowania czworonogiem. W tym wypadku chorzy rehabilitanci kierowani są na inne terapie bądź programy leczenia.");

	
	@RequestMapping("/about")
	public AboutDogtherapySection getAboutDogtherapySection() {
		return DEFAULT;
	}
}
