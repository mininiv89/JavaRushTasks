package com.javarush.task.task18.task1815;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
/*
Таблица
*/
public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface ATableInterface;

        public TableInterfaceWrapper(ATableInterface ATableInterface) {
            this.ATableInterface = ATableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            ATableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return ATableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ATableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    }

}