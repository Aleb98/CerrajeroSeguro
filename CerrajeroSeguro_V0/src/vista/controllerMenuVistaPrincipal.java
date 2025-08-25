package vista;

import javax.swing.JPanel;
import vista.VistaPrincipal;

public class controllerMenuVistaPrincipal {
    
    VistaPrincipal VistaPrincipal;
    
    public controllerMenuVistaPrincipal(VistaPrincipal VistaPrincipal){
        this.VistaPrincipal = VistaPrincipal;
    }
    
    public void cambiarVista(JPanel jPanel){
        jPanel.setSize(VistaPrincipal.getPanelPrincipal().getWidth(), VistaPrincipal.getPanelPrincipal().getHeight());
        VistaPrincipal.getPanelPrincipal().removeAll();
        VistaPrincipal.getPanelPrincipal().add(jPanel);
        VistaPrincipal.getPanelPrincipal().repaint();
        activarVista(jPanel);
    }
    private void activarVista(JPanel jPanel){
        VistaPrincipal.getPanelPrincipalVenta().setVisible(false);
        VistaPrincipal.getPanelPrincipalVenta().setEnabled(false);
        VistaPrincipal.getPanelPrincipalInventario().setVisible(false);
        VistaPrincipal.getPanelPrincipalInventario().setEnabled(false);
        //SE ESCONDEN LOS DEMAS JPANEL 
        jPanel.setVisible(true);
        jPanel.setEnabled(true);
    }
    
}
