package corejava.exceptions;

public class LicenseAgeException extends Exception{

//since extends exception, will ask you to add a serialversionid.

   private static final long serialVersionID=1L;private static int driverLicenseAge=16;

   public LicenseAgeException(int age){super("Req=yrs>=16, Uhav2 wait "+(driverLicenseAge-age)+" years.");}}