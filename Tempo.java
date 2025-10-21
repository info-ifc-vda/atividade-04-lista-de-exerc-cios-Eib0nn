public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora) {
        if (!validarTempo(hora, 0, 0)) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Tempo(int hora, int minuto) {
        if (!validarTempo(hora, minuto, 0)) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = 0;
        }
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (!validarTempo(hora, minuto, segundo)) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    private boolean validarTempo(int h, int m, int s) {
        return h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public long toSegundos() {
        return hora * 3600L + minuto * 60L + segundo;
    }

    public long diferencaSegundos(Tempo outro) {
        return Math.abs(this.toSegundos() - outro.toSegundos());
    }
}
