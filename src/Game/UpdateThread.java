package Game;

import javax.swing.JPanel;

class UpdateThread extends Thread {
    JPanel panel;

    public UpdateThread(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            panel.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}