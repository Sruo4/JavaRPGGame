package Game;

import java.util.ArrayList;

import javax.swing.JPanel;

public class GP extends JPanel{
    ArrayList<NPC1> npc1list = new ArrayList<NPC1>();
    ArrayList<NPC1> npc1list_2 = new ArrayList<NPC1>();

    NPC1 npc_1 = new NPC1("src\\Image\\npc01.png", 500, 350, this);
    NPC1 npc_2 = new NPC1("src\\Image\\playerdown.png", 350, 500, this);
}
