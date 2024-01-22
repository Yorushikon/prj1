package choice;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


import javax.swing.*;
import javax.swing.text.Position;


public class OneClickGame {
	
	JFrame gamewindow;
	Container con ;	
	Font titleFont = new Font("Ink Free",Font.PLAIN,100);
	Font normalFont = new Font("Ink Free",Font.PLAIN,50);
	Font gamefont = new Font("Ink Free",Font.PLAIN,35);
	JTextArea textArea = new JTextArea();
	int playerhp, playershards, monsterHP, bossHP;
	String playerweapon , pos;
	
	TitleHandle THandle = new TitleHandle();
	Dochoice dochoice = new Dochoice();
		
		JPanel titleP = new JPanel();
		JPanel startP = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel choicePanel = new JPanel();
		JPanel hpPanel = new JPanel();
		JPanel intPanel = new JPanel();
		JPanel imagePanel = new JPanel();
		
		
		JLabel titleL = new JLabel("Nanashi Mumei");
		JLabel hp = new JLabel("HP: ");
		JLabel hpnumber = new JLabel();
		JLabel shard = new JLabel("Shards: ");
		JLabel shardnumber = new JLabel();
		JLabel weapon = new JLabel("Item: ");
		JLabel weaponname = new JLabel();
		JLabel imageLabel = new JLabel();
		
		ImageIcon imageIcon;
		
		JButton startButton = new JButton("Get Moom");
		JButton choice1, choice2, choice3, choice4;
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OneClickGame();
		
	}
	public OneClickGame() {

		gamewindow = new JFrame();
		gamewindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		gamewindow.setVisible(true);
		gamewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamewindow.getContentPane().setBackground(Color.decode("#C4A484"));
		gamewindow.setLayout(null);
		gamewindow.setVisible(true);
		con = gamewindow.getContentPane();	
		
		titleP.setBounds(100,200,1350,200);
		titleP.setBackground(Color.decode("#C4A484"));
		titleL.setForeground(Color.white);
		titleL.setFont(titleFont);
		
		startP.setBounds(500, 500, 550, 200);
		startP.setBackground(Color.decode("#C4A484"));
		
		startButton.setBackground(Color.decode("#C4A484"));
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(THandle);
		startButton.setFocusPainted(false);
		
			
		
		titleP.add(titleL);
		con.add(titleP);	
		startP.add(startButton);
		con.add(startP);
		
	}
	public void Gamecreate() {
		
		titleP.setVisible(false);
		startP.setVisible(false);
		
		textPanel.setBounds(100,420,1350,150);
		textPanel.setBackground(Color.decode("#C4A484"));
		con.add(textPanel);
		
		hpPanel.setBounds(100,25,1450,50);
		hpPanel.setBackground(Color.decode("#C4A484"));
		hpPanel.setLayout(new GridLayout(1,6));
		con.add(hpPanel);
		

		textArea.setBounds(100,420,1350,150);
		textArea.setBackground(Color.decode("#C4A484"));
		textArea.setForeground(Color.white);
		textArea.setFont(gamefont);
		textArea.setLineWrap(true);
		textPanel.add(textArea);
		
		choicePanel.setBounds(200,550,1150,200);
		choicePanel.setBackground(Color.decode("#C4A484"));
		choicePanel.setLayout(new GridLayout(2,4));
		con.add(choicePanel);
		
		imagePanel.setBounds(100,100,1350,300);
		imagePanel.setBackground(Color.decode("#C4A484"));
		con.add(imagePanel);
		
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1313.png");
		
		imageLabel.setIcon(imageIcon);
		imagePanel.add(imageLabel);
		
		choice1 = new JButton("1");
		choice1.setBackground(Color.white);
		choice1.setForeground(Color.DARK_GRAY);
		choice1.setFont(gamefont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(dochoice);
		choice1.setActionCommand("p1");
		choicePanel.add(choice1);
		
		choice2 = new JButton("2");
		choice2.setBackground(Color.white);
		choice2.setForeground(Color.DARK_GRAY);
		choice2.setFont(gamefont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(dochoice);
		choice2.setActionCommand("p2");
		choicePanel.add(choice2);
		
		choice3 = new JButton("3");
		choice3.setBackground(Color.white);
		choice3.setForeground(Color.DARK_GRAY);
		choice3.setFont(gamefont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(dochoice);
		choice3.setActionCommand("p3");
		choicePanel.add(choice3);
		
		choice4 = new JButton("4");
		choice4.setBackground(Color.white);
		choice4.setForeground(Color.DARK_GRAY);
		choice4.setFont(gamefont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(dochoice);
		choice4.setActionCommand("p4");
		choicePanel.add(choice4);
		
		hp.setForeground(Color.white);
		hp.setFont(normalFont);
		hpPanel.add(hp);
		hpnumber.setForeground(Color.white);
		hpnumber.setFont(normalFont);
		hpPanel.add(hpnumber);
		shard.setForeground(Color.white);
		shard.setFont(normalFont);
		hpPanel.add(shard);
		shardnumber.setForeground(Color.white);
		shardnumber.setFont(normalFont);
		hpPanel.add(shardnumber);
		weapon.setForeground(Color.white);
		weapon.setFont(normalFont);
		hpPanel.add(weapon);
		weaponname.setForeground(Color.white);
		weaponname.setFont(normalFont);
		hpPanel.add(weaponname);
		
		player();
		
		

	}
	public void player() {
		playerhp = 10;
		playershards = 0;
		playerweapon = "Fist";
		weaponname.setText(playerweapon);
		hpnumber.setText(""+ playerhp);
		shardnumber.setText("" + playershards);
		
		firstencounter();
	}
	public void firstencounter(){
	    pos = "firstencounter";
	    imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1313.png");
		imageLabel.setIcon(imageIcon);
	    textArea.setText("Fauna:   Welcome to our Civilization! I'm Fauna, the Mother Nature of Memories Forest. \nI've found you passed out by the entrance of the Corrupted Land.  \nHow should I call you? Stranger?");
	    choice1.setText("I don't know");
	    choice2.setText("I can't remember");
	    choice3.setText("Where am I?");
	    choice4.setText("...");
	}

	public void firstencounterans() {
	    pos = "firstencounterans";
	    textArea.setText("Fauna: You must be a Lost Child from the wood");
	    choice1.setText("Lost Child?");
	    choice2.setText("What is it?");
	    choice3.setText("How can I get my memories back?");
	    choice4.setText("...");
	}
	
	public void firstencounterlast() {
	    pos = "firstencounterlast";  
	    textArea.setText("Fauna: You can get your Memories back from Baelz, the Devil of Destruction. \nYou need to find 150 memory shards to challenge her, get it through your adventure!");
	    choice1.setText("Begin your adventure");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void entrance() {
		pos = "entrance";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1314.png");
		imageLabel.setIcon(imageIcon);
		
	    textArea.setText("You are at the entrance of the village, where will you go next?");
	    choice1.setText("Twilight Forest");
	    choice2.setText("Corrupted Wasteland");
	    choice3.setText("Quantum Sea");
	    choice4.setText("Devil's Tower");		
	}
		
	public void forest() {
		pos = "forest";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1315.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("You start to walk into the forest.");
	    choice1.setText("Continue walking");
	    choice2.setText("A suspicious woman waiting for you?");
	    choice3.setText("There's a house, come and see it");
	    choice4.setText("Go Back");
	}
	
	public void wasteland() {
		pos = "wasteland";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1316.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("Seem like nothing here \nOnly corrupted tree...");
	    choice1.setText("Start searching");
	    choice2.setText("Take a nap");
	    choice3.setText("But a corrupted portal");
	    choice4.setText("Go Back");
	}
	
	public void sea() {
		pos = "sea";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1318.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("The water is deep blue  \nYou wondering what going on under there.");
	    choice1.setText("Dive into the Quantum Sea");
	    choice2.setText("Hanging around the beach");
	    choice3.setText("Take a rest");
	    choice4.setText("Go back");
	}
	
	public void tower() {
		pos = "tower";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\tower.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("You are at the tower of the Devil \nShe may sleep inside");
	    choice1.setText("Challenge the Devil's henchman");
	    choice2.setText("Try to fight some small demons");
	    choice3.setText("Challenge the Devil");
	    choice4.setText("Better not wake up the beast");
	}
	
	public void lucky() {
		pos = "lucky";
		textArea.setText("You found 1 memory shard");
		playershards = playershards + 1;
		shardnumber.setText(""+ playershards);

		
		choice1.setText("Go back");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void rest() {
		pos = "rest";
		
		int res = new Random().nextInt(2);
		
		textArea.setText("You take a rest, it might heal your HP");
		
		playerhp = playerhp + res;
		hpnumber.setText(""+ playerhp);
		choice1.setText("Go back");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void dive() {
		pos = "dive";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\dive.png");
		imageLabel.setIcon(imageIcon);
		textArea.setText("You found a Mythical Sword");
		playerweapon = "Sword";
		weaponname.setText(playerweapon);
	    choice1.setText("Go back to the beach");
	    choice2.setText("Searching for more");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void gura() {
		pos = "gura";
		monsterHP = 30;
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\gura.png");
		imageLabel.setIcon(imageIcon);
		textArea.setText("Gura: Gawr Gawr \nYou encounter a small shark");
	    choice1.setText("Fight");
	    choice2.setText("Run away");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void fight() {
		pos = "fight";
		
		monsterHP = 30;
		textArea.setText("Monster Hp: " + monsterHP + "\nWhat do you do?");
		choice1.setText("Physical Attack");
	    choice2.setText("Spell Attack");
	    choice3.setText("Healing");
	    choice4.setText("Run away");
	}
	public void pattack() {
		pos = "pattack";
		
		int pdamage = 0;
		
		
		if(playerweapon.equals("Fist")) {
		pdamage = new Random().nextInt(4);
		}
		else if (playerweapon.equals("Sword")) {
		pdamage = new Random().nextInt(8);
		}
		
		textArea.setText("You deal "+ pdamage + " damage!");
		
		monsterHP = monsterHP - pdamage;
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void pattackb() {
		pos = "pattackb";
		
		int pdamageb = 0;
		
		
		if(playerweapon.equals("Fist")) {
		pdamageb = new Random().nextInt(4);
		}
		else if (playerweapon.equals("Sword")) {
		pdamageb = new Random().nextInt(8);
		}
		
		textArea.setText("You deal "+ pdamageb + " damage!");
		
		bossHP = bossHP - pdamageb;
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void sattack() {
		pos = "sattack";
		monsterHP = monsterHP - 5;
		textArea.setText("Your spell deal 5 damage!");
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");	
	}
	
	public void sattackb() {
		pos = "sattackb";
		bossHP = bossHP - 5;
		textArea.setText("Your spell deal 5 damage!");
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void healing() {
		pos = "healing";
		
		int heal = 0;
		
		heal = new Random().nextInt(6);
		
		textArea.setText("You heal "+ heal + " HP!");
		playerhp = playerhp + heal;
		hpnumber.setText(""+ playerhp);
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void healingb() {
		pos = "healingb";
		
		int healb = 0;
		
		healb = new Random().nextInt(7);
		
		textArea.setText("You heal "+ healb + " HP!");
		playerhp = playerhp + healb;
		hpnumber.setText(""+ playerhp);
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void mattack() {
		pos = "mattack";
		
		int mdamage = 0;
		
		mdamage = new Random().nextInt(5);


		textArea.setText("The monster deal "+ mdamage + " damage!");
		playerhp = playerhp - mdamage;
		hpnumber.setText(""+ playerhp);
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void battack() {
		pos = "battack";
		
		int bdamage = 0;
		
		bdamage = new Random().nextInt(8);


		textArea.setText("The Devil deal "+ bdamage + " damage!");
		playerhp = playerhp - bdamage;
		hpnumber.setText(""+ playerhp);
		
		choice1.setText("Continue");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void defeat() {
		pos = "defeat";
		textArea.setText("You defeated the monster \n You receive 25 shards");
		playershards = playershards + 25;
		shardnumber.setText(""+ playershards);

		
		choice1.setText("Go back to the entrance");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void dead() {
		pos = "dead";
		
		textArea.setText("You are dead! \n GAME OVER!!!");
		choice1.setText("Restart");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");

	}
	
	public void assault() {
		pos = "assault";
		textArea.setText("You have been assaulted by a group of demons. Luckily you escaped with 1hp!");
		
		playerhp = 1;
		hpnumber.setText(""+ playerhp);
		choice1.setText("Run away");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void towa() {
		pos = "towa";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\towa.png");
		imageLabel.setIcon(imageIcon);

		textArea.setText("Towa: Who are you? Hey!? You not allowed to be here");
		choice1.setText("Fight");
	    choice2.setText("Run away");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void noboss(){
		pos = "noboss";
		textArea.setText("You don't have enough Shards for the boss");
		choice1.setText("Go back");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void boss() {
		pos = "boss";
		bossHP = 200;
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\baelz.png");
		imageLabel.setIcon(imageIcon);

		textArea.setText("Baelz: You finally came!");
		choice1.setText("Fight");
	    choice2.setText("Run away");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void baelz() {
		pos = "baelz";
		textArea.setText("Devil HP: " + bossHP + "\nWhat do you do?");
		choice1.setText("Physical Attack");
	    choice2.setText("Spell Attack");
	    choice3.setText("Healing");
	    choice4.setText("Run away");
	}
	
	public void win() {
		pos = "win";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\win.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("");
		choice1.setText("");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	    textArea.setVisible(false);
	    choice1.setVisible(false);
	    choice2.setVisible(false);
	    choice3.setVisible(false);
	    choice4.setVisible(false);
	    
	}
	
	public void search() {
		pos = "search";
		textArea.setText("You found nothing");
		choice1.setText("Go back");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	public void watame() {
		pos = "watame";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1317.png");
		imageLabel.setIcon(imageIcon);
		textArea.setText("Some crows noise wake you up, it did nothing...");
		choice1.setText("Go back");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void suprise() {
		pos = "suprise";
		textArea.setText("On the way back, the sky suddenly went dark, you passed out and wake up at the middle    of nowhere.");
		choice1.setText("...");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void loop() {
		pos = "loop";
		textArea.setText("After days of walking, you soon again reach the Village's entrance \n Seem like the forest won't let you go further.");
		choice1.setText("...");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void portal(){
		pos = "portal";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1319.png");
		imageLabel.setIcon(imageIcon);
		textArea.setText("The portal got some kind of glitch, the glitch kill you instanly");
		choice1.setText("...");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void fauna() {
		pos = "fauna";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\1313.png");
		imageLabel.setIcon(imageIcon);
		
		textArea.setText("You met Fauna at the house. \n Fauna: If you need healing, I can sell you a potion for 15 shards");
		choice1.setText("Buy Potion");
	    choice2.setText("Leave");
	    choice3.setText("");
	    choice4.setText("");
	}
	public void kronii() {
		pos = "kronii";
		imageIcon = new ImageIcon("C:\\Users\\Admin\\Downloads\\dad.png");
		imageLabel.setIcon(imageIcon);
		textArea.setText("Calli: Wanna exchange your life for some memory shards? Only 2 for 1");
		choice1.setText("Exchange 2");
	    choice2.setText("Exchange 10");
	    choice3.setText("Exchange 100");
	    choice4.setText("Leave");
	}
	
	public void buy() {
		pos = "buy";
		textArea.setText("You drink a Potion, your HP go up by 20");
		playershards = playershards - 15;
		shardnumber.setText("" + playershards);
		playerhp = playerhp + 20;
		hpnumber.setText(""+ playerhp);
		choice1.setText("");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	    
	    fauna();
	}
	
	public void cantbuy() {
		pos = "cantbuy";
		textArea.setText("You don't have enough shards to purchase this!");
		choice1.setText("Leave");
	    choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void ex1() {
		pos = "ex1";
		textArea.setText("You exchange 2 hp for 1 shard");
		playershards = playershards +1;
		shardnumber.setText("" + shardnumber);
		playerhp = playerhp - 2;
		hpnumber.setText(""+ playerhp);
		
		kronii();
	}
	
	public void ex10() {
		pos = "ex10";
		textArea.setText("You exchange 10 hp for 5 shard");
		playershards = playershards +5;
		shardnumber.setText("" + shardnumber);
		playerhp = playerhp - 10;
		hpnumber.setText(""+ playerhp);
		
		kronii();
	}
	
	public void ex100() {
		pos = "ex1";
		textArea.setText("You exchange 100 hp for 50 shard");
		playershards = playershards +50;
		shardnumber.setText("" + shardnumber);
		playerhp = playerhp - 100;
		hpnumber.setText(""+ playerhp);
		
		kronii();
	}
	
public class TitleHandle implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Gamecreate();
	}

}

public class Dochoice implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String urChoice = e.getActionCommand();

        switch (pos) {
        case "firstencounter":
            switch (urChoice) {
                case "p1":
                case "p2":
                case "p3":
                case "p4":
                    firstencounterans();
                    break;
            }
            break;
        case "firstencounterans":
            switch (urChoice) {
                case "p1":
                case "p2":
                case "p3":
                case "p4":
                    firstencounterlast();  
                    break;
            }
            break;
        case "firstencounterlast":
        	switch (urChoice) {
        		case "p1": entrance();break;
        		case "p2":
        		case "p3":
        		case "p4":
        			break;
        	}
        	break;
        	
        case "entrance":
        	switch (urChoice) {
        		case "p1": forest(); break;
        		case "p2": wasteland(); break;
        		case "p3": sea(); break;
        		case "p4": tower(); break;
        	}
        	break;
        	
        case "forest":
        	switch (urChoice) {
        		case "p1": loop(); break;
        		case "p2": kronii(); break;
        		case "p3": fauna(); break;
        		case "p4": entrance(); break;
        	}
        	break;
        	
        case "wasteland":
        	switch (urChoice) {
        		case "p1": search(); break;
        		case "p2": watame(); break;
        		case "p3": portal(); break;
        		case "p4": entrance(); break;
        	}
        	break;
        	
        case "sea":
        	switch (urChoice) {
        		case "p1": dive(); break;
        		case "p2": lucky(); break;
        		case "p3": rest(); break;
        		case "p4": entrance(); break;
        	}
        	break;
        	
        case "tower":
        	switch (urChoice) {
        		case "p1": towa(); break;
        		case "p2": assault(); break;
        		case "p3": 
        			if (playershards > 149) {
        				boss();
        			}
        			else {
        				noboss();
        			}
        			break;
        		case "p4": entrance(); break;
        	}
        	break;
        	
        case "lucky":
        	switch (urChoice) {
    		case "p1": sea(); break;}
        	break;
        
        case "rest":
        	switch (urChoice) {
    		case "p1": sea(); break;}
        	break;


        	
        case "dive":
        	switch (urChoice) {
        		case "p1": sea(); break;
        		case "p2": gura(); break;
        		case "p3": break;
        		case "p4": break;
        	}
        	break;
        	
        case "gura":
        	switch (urChoice) {
        		case "p1": fight(); break;
        		case "p2": sea(); break;
        		case "p3": break;
        		case "p4": break;
        	}
        	break;
        	
        case "fight":
        	switch (urChoice) {
    		case "p1": pattack(); break;
    		case "p2": sattack(); break;
    		case "p3": healing(); break;
    		case "p4": entrance(); break;
    	}
        	break;
        	
        case "pattack":
        	switch (urChoice) {
    		case "p1": 
    			if (monsterHP < 1) {
    				defeat();
    			}
    			else {
    			mattack(); 
    			}
    			break;
        	}
        	break;
        case "pattackb":
        	switch (urChoice) {
    		case "p1": 
    			if (bossHP < 1) {
    				defeat();
    			}
    			else {
    			battack(); 
    			}
    			break;
        	}
        	break;
        	
        case "sattack":
        	switch (urChoice) {
    		case "p1": 
    			if (monsterHP < 1) {
    				win();
    			}
    			else {
    			mattack(); 
    			}
    			break;
            }
        	break;
        	
        case "sattackb":
        	switch (urChoice) {
    		case "p1": 
    			if (bossHP < 1) {
    				win();
    			}
    			else {
    			battack(); 
    			}
    			break;
            }
        	break;
        	
        case "healing":
        	switch (urChoice) {
    		case "p1": 
    			if (monsterHP < 1) {
    				defeat();
    			}
    			else {
    			mattack(); 
    			}
    			break;
            }
        	break;
        case "healingb":
        	switch (urChoice) {
    		case "p1": 
    			if (bossHP < 1) {
    				win();
    			}
    			else {
    			battack(); 
    			}
    			break;
            }
        	break;
        	
        case "mattack":
        	switch (urChoice) {
    		case "p1":
    			if (playerhp < 1) {
    				dead();
    			}
    			else {
    			fight(); 
    			}
    			break;
            }
        	break;
        case "battack":
        	switch (urChoice) {
    		case "p1":
    			if (playerhp < 1) {
    				dead();
    			}
    			else {
    			baelz(); 
    			}
    			break;
            }
        	break;
        	
        case "defeat":
        	switch (urChoice) {
    		case "p1": entrance(); break;
            }
        	break;
        	
        case "dead":
        	switch (urChoice) {
    		case "p1": player(); break;
            }
        	break;
        	
        case "noboss":
        	switch (urChoice) {
    		case "p1": tower(); break;
            }
        	break;
        	
        case "boss":
        	switch (urChoice) {
    		case "p1": baelz();  break;
    		case "p2": tower(); break;
            }
        	break;
        case "watame":
        	switch (urChoice) {
    		case "p1": wasteland(); break;
            }
        	break;
        case "baelz":
        	switch (urChoice) {
    		case "p1": pattackb(); break;
    		case "p2": sattackb(); break;
    		case "p3": healingb(); break;
    		case "p4": tower(); break;
    	}
        	break;
        
        case "assault":
        	switch (urChoice) {
    		case "p1": tower(); break;
            }
        	break;
        
        case "towa":
        	switch (urChoice) {
        	case "p1": fight(); break;
    		case "p2": tower(); break;
            }
        	break;
        
        case "search":
        	switch (urChoice) {
        	case "p1": suprise(); break;
            }
        	break;
        
        case "suprise":
        	switch (urChoice) {
        	case "p1": entrance(); break;
        	}
        	break;
        case "loop":
        	switch (urChoice) {
        	case "p1": entrance(); break;
        	}
        	break;
        	
        case "portal":
        	switch (urChoice) {
        	case "p1": dead(); break;
        	}
        	break;
        	
        case "fauna":
        	switch (urChoice) {
        	case "p1": 
        		if (playershards > 14) {
        		buy();}
        		else {
        			cantbuy();
        		}
        		break;
        	case "p2": forest(); break;
        	}
        	break;
        	
        case "kronii":
        	switch (urChoice) {
        	case "p1": 
        		if (playerhp <3) {dead();}
        		else {ex1();} break;
        	case "p2": 
        		if (playerhp < 11) {dead();}
        		else {ex10();} break;
        	case "p3": 
        		if (playerhp < 100) {dead();}
        		else {ex100();} break;
        	case "p4": forest(); break;
        	}
        	break;
        
        case "cantbuy":
        	switch (urChoice) {
        	case "p1": fauna(); break;
        	}
        	break;
    }
}
}
}
