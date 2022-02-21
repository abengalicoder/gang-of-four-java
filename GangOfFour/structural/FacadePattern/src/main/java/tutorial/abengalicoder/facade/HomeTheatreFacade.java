package tutorial.abengalicoder.facade;

import tutorial.abengalicoder.facade.subsystem.DVD;
import tutorial.abengalicoder.facade.subsystem.Lights;
import tutorial.abengalicoder.facade.subsystem.Screen;

public class HomeTheatreFacade {
	
	DVD dvd = new DVD();
	Lights lights = new Lights();
	Screen screen = new Screen();
	
	public void watchMovie() {
		dvd.on();
		dvd.play("Rang De Basanti");
		lights.on();
		screen.up();
	}

	public void stopMovie() {
		dvd.eject();
		dvd.stop();
		lights.off();
		screen.down();
	}
}
