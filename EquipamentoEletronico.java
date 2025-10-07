
public class EquipamentoEletronico {

	private float tensao;
    private float consumo;

    public EquipamentoEletronico(float tensao, float consumo) {
        this.tensao = tensao;
        this.consumo = consumo;
    }

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getConsumo() {
        return consumo;
    }

 
    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    
    public String toString() {
        return "EquipamentoEletronico{" +
               "tensao=" + tensao + "V, " +
               "consumo=" + consumo + "W}";
    }
}



