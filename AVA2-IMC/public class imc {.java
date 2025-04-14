public class imc {
    private Double imcPessoa; 

    public void calcularImc(){
        double imcPessoa =  peso / (altura * altura);
    }
    public void AnaliseImc(){
        if (imcPessoa < 18.5){
            System.out.println("baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.\n");

        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9){
            System.out.println("peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal.\n");
       
        } else if (imcPessoa >= 25 && imcPessoa <= 29.9){
            System.out.println(" sobrepeso. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.\n");
        
        } else if (imcPessoa >= 30.0 && imcPessoa <= 34.9){
            System.out.println("obesidade grau I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.\n")
        
        } else if (imcPessoa >= 35 && imcPessoa <=  39.9){
            System.out.println("obesidade grau II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.\n")
        
        } else if (imcPessoa >= 40){
            System.out.println(" obesidade grau III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.\n")
        }


    }
}