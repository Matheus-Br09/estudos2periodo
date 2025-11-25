public class ValidadorTemperatura {

    public void verificarTempeartura(int temperatura) throws TemperaturaInvalidaException{
        if (temperatura < -90 || temperatura > 60){
            throw new TemperaturaInvalidaException();
        }
    }

}
