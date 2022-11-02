public class Connect4 {

    public static void main(String[] args) {
        int state = 0;
        gui Gui = new gui();
        while (state != -1) {
            switch (state) {
                case 0:
                    Gui.updateBoard();
                    if (Gui.getHasWon()) {
                        state = 1;
                    } else if (Gui.getHasDraw()) {
                        state = 2;
                    } else if (Gui.getNewGame()) {
                        Gui = new gui();
                        state = 0;
                    }
                    break;
                case 1:
                    Gui.showWon();
                    if (Gui.getQuit()) {
                        state = -1;
                    } else  if (Gui.getNewGame()) {
                        Gui = new gui();
                        state = 0;
                    }
                    break;
                case 2:
                    Gui.showDraw();
                    if (Gui.getQuit()) {
                        state = -1;
                    } else if (Gui.getNewGame()) {
                        Gui = new gui();
                        state = 0;
                    }
                    break;
                }
            }
        }
}
