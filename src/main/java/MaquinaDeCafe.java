public class MaquinaDeCafe {

    Vaso vasosPequeño;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Cafetera cafetera;
    Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void setVasosPequeño(Vaso vaso) {
        this.vasosPequeño = vaso;
    }

    public void setVasosMediano(Vaso vaso) {
        this.vasosMediano = vaso;
    }

    public void setVasosGrande(Vaso vaso) {
        this.vasosGrande = vaso;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Vaso getTipoVaso(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pequeño":
                return vasosPequeño;
            case "mediano":
                return vasosMediano;
            case "grande":
                return vasosGrande;
            default:
                return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {

        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }

        if (!cafetera.hasCafe(vaso.getCapacidadVaso() * cantidadVasos)) {
            return "No hay Cafe";
        }

        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(vaso.getCapacidadVaso() * cantidadVasos);
        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public Vaso getVasosPequeño() {
        return vasosPequeño;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }
}