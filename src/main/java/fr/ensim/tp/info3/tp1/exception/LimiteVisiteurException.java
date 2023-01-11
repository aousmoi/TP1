package fr.ensim.tp.info3.tp1.exception;

public class LimiteVisiteurException extends Exception{

	public LimiteVisiteurException() {
		super("Le nombre maximum de visiteurs atteint");
	}
}
