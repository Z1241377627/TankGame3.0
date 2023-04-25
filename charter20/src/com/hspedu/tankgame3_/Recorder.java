package com.hspedu.tankgame3_;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Vector;

public class Recorder {
    private static int allEnemyNum = 0;
    private static String recordFile = "src\\myRecord.txt";
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static Vector<Enemy> enemys = null;
    private static Vector<Node> nodes = new Vector<>();

    public static Vector<Node> getNodesAndEnemyRes() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyNum = Integer.parseInt(br.readLine());
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return nodes;
    }

    public static void setEnemys(Vector<Enemy> enemys) {
        Recorder.enemys = enemys;
    }

    public static int getAllEnemyNum() {
        return allEnemyNum;
    }

    public static void setAllEnemyNum(int allEnemyNum) {
        Recorder.allEnemyNum = allEnemyNum;
    }

    public static void addAllEnemyNum(){
        allEnemyNum++;
    }

    public static void keepRecord(){
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyNum + "");
            bw.newLine();
            for (int i = 0; i < enemys.size(); i++){
                Enemy enemy = enemys.get(i);
                if (enemy.loop){
                    String record = enemy.getX() + " " + enemy.getY() + " " + enemy.getDirect();
                    bw.write(record);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
