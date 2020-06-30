/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrados;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author vitor
 */
public class Quadrados {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int choice = 1,  h = 1000, w = 1020;
        int[] white = new int[]{255, 255, 255};
        int[] black = new int[]{0, 0, 0};
        int[] blue = new int[]{0, 0, 255};
        int[] red = new int[]{255, 0, 0};
        int[] green = new int[]{0, 255, 0};
        int[] yellow = new int[]{255, 255, 0};

        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();
        int[] pixels = new int[h * w * 3];
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            for (int i = 0; i < 50; i++) {
                System.out.println(" ");
            }
            System.out.println("0: Finalizar");
            System.out.println("1: Quadrado Espiral");
            System.out.println("2: Quadrado dentro de outro quadrado");
            System.out.println("3: Quadrado Mosaico");
            System.out.println("4: Matrix");
            System.out.println("   ");
            System.out.print("Escolha uma opção acima: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    System.out.println("Finalizado.");
                    break;
                case 1:
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y < 1500) {
                                raster.setPixel(x, y, white);
                            }
                        }
                    }

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (x > 500 && x <= 520 && y > 500 && y <= 520) {
                                raster.setPixel(x, y, black);
                            } else if (y > 520 && y <= 540 && x > 500 && x <= 540) {
                                raster.setPixel(x, y, black);
                            } else if (y > 480 && y <= 540 && x > 540 && x <= 560) {
                                raster.setPixel(x, y, black);
                            } else if (y > 460 && y <= 480 && x > 480 && x <= 560) {
                                raster.setPixel(x, y, black);
                            } else if (y > 460 && y <= 560 && x > 460 && x <= 480) {
                                raster.setPixel(x, y, black);
                            } else if (y > 560 && y <= 580 && x > 460 && x <= 580) {
                                raster.setPixel(x, y, black);
                            } else if (y > 440 && y <= 580 && x > 580 && x <= 600) {
                                raster.setPixel(x, y, black);
                            } else if (y > 420 && y <= 440 && x > 440 && x <= 600) {
                                raster.setPixel(x, y, black);
                            } else if (y > 420 && y <= 600 && x > 420 && x <= 440) {
                                raster.setPixel(x, y, black);
                            } else if (y > 600 && y <= 620 && x > 420 && x <= 620) {
                                raster.setPixel(x, y, black);
                            } else if (y >= 400 && y <= 620 && x > 620 && x <= 640) {
                                raster.setPixel(x, y, black);
                            } else if (y > 380 && y <= 400 && x > 400 && x <= 640) {
                                raster.setPixel(x, y, black);
                            } else if (y > 380 && y <= 640 && x > 380 & x <= 400) {
                                raster.setPixel(x, y, black);
                            } else if (y > 640 && y <= 660 && x > 380 && x <= 660) {
                                raster.setPixel(x, y, black);
                            } else if (y > 360 && y <= 660 && x > 660 && x <= 680) {
                                raster.setPixel(x, y, black);
                            } else if (y > 340 && y <= 360 && x > 360 && x <= 680) {
                                raster.setPixel(x, y, black);
                            } else if (y > 340 && y <= 680 && x > 340 && x <= 360) {
                                raster.setPixel(x, y, black);
                            } else if (y > 680 && y <= 700 && x > 340 && x <= 700) {
                                raster.setPixel(x, y, black);
                            } else if (y > 320 && y <= 700 && x > 700 && x <= 720) {
                                raster.setPixel(x, y, black);
                            } else if (y > 300 && y <= 320 && x > 320 && x <= 720) {
                                raster.setPixel(x, y, black);
                            } else if (y > 300 && y <= 720 && x > 300 && x <= 320) {
                                raster.setPixel(x, y, black);
                            } else if (y > 720 && y <= 740 && x > 300 && x <= 740) {
                                raster.setPixel(x, y, black);
                            } else if (y > 280 && y <= 740 && x > 740 && x <= 760) {
                                raster.setPixel(x, y, black);
                            } else if (y > 260 && y <= 280 && x > 280 && x <= 760) {
                                raster.setPixel(x, y, black);
                            } else if (y > 260 && y <= 760 && x > 260 && x <= 280) {
                                raster.setPixel(x, y, black);
                            } else if (y > 760 && y <= 780 && x > 260 && x <= 780) {
                                raster.setPixel(x, y, black);
                            } else if (y > 240 && y <= 780 && x > 780 && x <= 800) {
                                raster.setPixel(x, y, black);
                            } else if (y > 220 && y <= 240 && x > 240 && x <= 800) {
                                raster.setPixel(x, y, black);
                            } else if (y > 220 && y <= 800 && x > 220 && x <= 240) {
                                raster.setPixel(x, y, black);
                            } else if (y > 800 && y <= 820 && x > 220 && x <= 820) {
                                raster.setPixel(x, y, black);
                            } else if (y > 200 && y <= 820 && x > 820 && x <= 840) {
                                raster.setPixel(x, y, black);
                            } else if (y > 180 && y <= 200 && x > 200 && x <= 840) {
                                raster.setPixel(x, y, black);
                            } else if (y > 180 && y <= 840 && x > 180 && x <= 200) {
                                raster.setPixel(x, y, black);
                            } else if (y > 840 && y <= 860 && x > 180 && x <= 860) {
                                raster.setPixel(x, y, black);
                            } else if (y > 160 && y <= 860 && x > 860 && x <= 880) {
                                raster.setPixel(x, y, black);
                            } else if (y > 140 && y <= 160 && x > 160 && x <= 880) {
                                raster.setPixel(x, y, black);
                            } else if (y > 140 && y <= 880 && x > 140 && x <= 160) {
                                raster.setPixel(x, y, black);
                            } else if (y > 880 && y <= 900 && x > 140 && x <= 900) {
                                raster.setPixel(x, y, black);
                            } else if (y > 120 && y <= 900 && x > 900 && x <= 920) {
                                raster.setPixel(x, y, black);
                            } else if (y > 100 && y <= 120 && x > 120 && x <= 920) {
                                raster.setPixel(x, y, black);
                            } else if (y > 100 && y <= 920 && x > 100 && x <= 120) {
                                raster.setPixel(x, y, black);
                            } else if (y > 920 && y <= 940 && x > 100 && x <= 940) {
                                raster.setPixel(x, y, black);
                            } else if (y > 80 && y <= 940 && x > 940 && x <= 960) {
                                raster.setPixel(x, y, black);
                            } else if (y > 60 && y <= 80 && x > 80 && x <= 960) {
                                raster.setPixel(x, y, black);
                            } else if (y > 60 && y <= 960 && x > 60 && x <= 80) {
                                raster.setPixel(x, y, black);
                            } else if (y > 960 && y <= 980 && x > 60 && x <= 980) {
                                raster.setPixel(x, y, black);
                            } else if (y > 40 && y <= 980 && x > 980 && x <= 1000) {
                                raster.setPixel(x, y, black);
                            } else if (y > 20 && y <= 40 && x > 40 && x <= 1000) {
                                raster.setPixel(x, y, black);
                            } else if (y > 20 && y <= 1000 && x > 20 && x <= 40) {
                                raster.setPixel(x, y, black);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Quadratic_Spiral.png"));
                    sc.nextLine();
                    break;

                case 2:
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            raster.setPixel(x, y, white);
                        }
                    }
                    int raio = 10, posx = 10, posy = 10, posXfinal = 1010;
                    int posYini = 10, posYfinal = 500, posXini = 10;
                    while (posy < posYfinal) {
                        while (posx < posXfinal) {
                            for (int y = -raio; y <= raio; y++) {
                                for (int x = -raio; x <= raio; x++) {
                                    raster.setPixel(x + posx, y + posy, black);
                                }
                            }
                            posx++;
                        }
                        posXini += 40;
                        posYini += 40;
                        posx = posXini;
                        posy = posYini;
                        posXfinal -= 40;
                    }
                    raio = 10;
                    posx = 10;
                    posy = 10;
                    posXfinal = 1010;
                    posYfinal = 990;
                    posXini = 10;
                    posYini = 10;
                    
                    while (posx < posXfinal) {
                        while (posy < posYfinal) {
                            for (int y = -raio; y <= raio; y++) {
                                for (int x = -raio; x <= raio; x++) {
                                    raster.setPixel(x + posx, y + posy, black);
                                }
                            }
                            posy++;
                        }
                        posXini += 40;
                        posYini += 40;
                        posx = posXini;
                        posy = posYini;
                        posYfinal -= 40;
                    }
                    raio = 10;
                    posx = 10;
                    posy = 989;
                    posXfinal = 1010;
                    posYfinal = 500;
                    posXini = 10;
                    posYini = 989;

                    while (posy > posYfinal) {
                        while (posx < posXfinal) {
                            for (int y = -raio; y <= raio; y++) {
                                for (int x = -raio; x <= raio; x++) {
                                    raster.setPixel(x + posx, y + posy, black);
                                }
                            }
                            posx++;
                        }
                        posXini += 40;
                        posYini -= 40;
                        posXfinal -= 40;
                        posy = posYini;
                        posx = posXini;
                    }
                    raio = 10;
                    posx = 1009;
                    posy = 10;
                    posXfinal = 500;
                    posYfinal = 990;
                    posXini = 1009;
                    posYini = 10;

                    while (posx > posXfinal) {
                        while (posy < posYfinal) {
                            for (int y = -raio; y <= raio; y++) {
                                for (int x = -raio; x <= raio; x++) {
                                    raster.setPixel(x + posx, y + posy, black);
                                }
                            }
                            posy++;
                        }
                        posXini -= 40;
                        posYini += 40;
                        posx = posXini;
                        posy = posYini;
                        posYfinal -= 40;
                    }
                    ImageIO.write(image, "PNG", new File("Square.png"));
                    sc.nextLine();
                    break;
                    
                case 3:
                    int partesX = w / 4;
                    int partesY = h / 5;
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (x < partesX && y < partesY) {
                                raster.setPixel(x, y, blue);
                            } else if (x > partesX && x < (partesX * 2) && y < partesY) {
                                raster.setPixel(x, y, black);
                            } else if (x > (partesX * 2) && x < (partesX * 3) && y < partesY) {
                                raster.setPixel(x, y, blue);
                            } else if (x > (partesX * 3) && y < partesY) {
                                raster.setPixel(x, y, black);
                            }
                            else if (x < partesX && y > partesY && y < (partesY * 2)) {
                                raster.setPixel(x, y, red);
                            } else if (x > partesX && x < (partesX * 2) && y > partesY && y < (partesY * 2)) {
                                raster.setPixel(x, y, white);
                            } else if (x > (partesX * 2) && x < (partesX * 3) && y > partesY && y < (partesY * 2)) {
                                raster.setPixel(x, y, red);
                            } else if (x > (partesX * 3) && y > partesY && y < (partesY * 2)) {
                                raster.setPixel(x, y, white);
                            }
                            else if (x < partesX && y > (partesY * 2) && y < (partesY * 3)) {
                                raster.setPixel(x, y, yellow);
                            } else if (x > partesX && x < (partesX * 2) && y > (partesY * 2) && y < (partesY * 3)) {
                                raster.setPixel(x, y, black);
                            } else if (x > (partesX * 2) && x < (partesX * 3) && y > (partesY * 2) && y < (partesY * 3)) {
                                raster.setPixel(x, y, yellow);
                            } else if (x > (partesX * 3) && y > (partesY * 2) && y < (partesY * 3)) {
                                raster.setPixel(x, y, black);
                            }
                            else if (x < partesX && y > (partesY * 3) && y < (partesY * 4)) {
                                raster.setPixel(x, y, black);
                            } else if (x > partesX && x < (partesX * 2) && y > (partesY * 3) && y < (partesY * 4)) {
                                raster.setPixel(x, y, white);
                            } else if (x > (partesX * 2) && x < (partesX * 3) && y > (partesY * 3) && y < (partesY * 4)) {
                                raster.setPixel(x, y, black);
                            } else if (x > (partesX * 3) && y > (partesY * 3) && y < (partesY * 4)) {
                                raster.setPixel(x, y, white);
                            }
                            else if (x < partesX && y > (partesY * 4)) {
                                raster.setPixel(x, y, white);
                            } else if (x > partesX && x < (partesX * 2) && y > (partesY * 4)) {
                                raster.setPixel(x, y, black);
                            } else if (x > (partesX * 2) && x < (partesX * 3) && y > (partesY * 4)) {
                                raster.setPixel(x, y, white);
                            } else if (x > (partesX * 3) && y > (partesY * 4)) {
                                raster.setPixel(x, y, black);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Mosaic_Square.png"));
                    sc.nextLine();
                    break;

                case 4:
                    pixels = new int[h * w * 3];
                    int x = 1;
                    int divisores = 0;
                    sc.nextLine();
                    for (int i = 0; i < pixels.length; i += 3) {
                        for (int k = 1; k <= x; k++) {
                            if (x % k == 0) {
                                divisores++;
                            }
                        }
                        if (divisores == 2) {
                            pixels[i] = 0;
                            pixels[i + 1] = 255;
                            pixels[i + 2] = 0;
                        } else {
                            pixels[i] = 0;
                            pixels[i + 1] = 0;
                            pixels[i + 2] = 0;
                        }
                        x++;
                        divisores = 0;
                    }
                    raster.setPixels(0, 0, w, h, pixels);
                    ImageIO.write(image, "PNG", new File("MatrixGrande.png"));
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Opção inválida, tente denovo");
                    sc.nextLine();
                    for (int i = 0; i < 50; i++) {
                        System.out.println(" ");
                    }
                    break;
            }
        }
    }
}