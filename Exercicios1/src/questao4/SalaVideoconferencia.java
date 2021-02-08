package questao4;

public class SalaVideoconferencia extends Sala{

    private boolean conexaoWiFi;
    private boolean camera;
    private boolean webCam;

    public SalaVideoconferencia(int capacidade, String id, String apelido, String titulo,
                                boolean conexaoWiFi, boolean camera, boolean webCam) {
        super(capacidade, id, apelido, titulo);
        this.conexaoWiFi = conexaoWiFi;
        this.camera = camera;
        this.webCam = webCam;
    }

    public boolean isConexaoWiFi() {
        return conexaoWiFi;
    }

    public void setConexaoWiFi(boolean conexaoWiFi) {
        this.conexaoWiFi = conexaoWiFi;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public boolean isWebCam() {
        return webCam;
    }

    public void setWebCam(boolean webCam) {
        this.webCam = webCam;
    }
}
