public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23456567");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O CEP informado é inválido");
        }

    }


    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        //Formato de returno "23.456-780";
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }

}
