package ie.tudublin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet {
	ArrayList<Nematode> nematodeList = new ArrayList<Nematode>();

	public void keyPressed() {
		if (keyCode == LEFT) {
		}
	}

	public void settings() {
		size(800, 800);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();
	}

	public void loadNematodes() {
		try {
			FileInputStream fstream = new FileInputStream("/data/nematodes.csv");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;
			boolean isFirstLine = true;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				if (isFirstLine == true) {
					isFirstLine = false;
				} else {
					StringTokenizer st = new StringTokenizer(strLine, ",");
					Nematode newNematode = new Nematode();
					int i = 0;
					while (st.hasMoreTokens()) {
						if (i == 0) {
							newNematode.setName(st.nextToken());
						} else if (i == 1) {
							newNematode.setLength(Integer.parseInt(st.nextToken()));
						} else if (i == 2) {
							newNematode.setLims(Integer.parseInt(st.nextToken()));
						} else if (i == 3) {
							newNematode.setGender(st.nextToken());
						} else if (i == 4) {
							newNematode.setEyes(Integer.parseInt(st.nextToken()));
						}
						i = i + 1;
					}

					nematodeList.add(newNematode);

				}

			}

			// Close the input stream
			fstream.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void draw() {

	}

}
