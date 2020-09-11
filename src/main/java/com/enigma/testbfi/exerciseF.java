package com.enigma.testbfi;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import info.debatty.java.stringsimilarity.JaroWinkler;
import info.debatty.java.stringsimilarity.Levenshtein;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class exerciseF  {
    public static void main(String[] args) throws Exception{
        exerciseF();
    }

    public static void exerciseF() throws Exception{
        System.out.println(solutionF("sisayang"));
        System.out.println(solutionF("pulxu pqnjzng"));
        System.out.println(solutionF("zogjakarta"));
    }

    public static List<String> solutionF(String input) throws Exception {
        String url = "https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json";
        Levenshtein levenshtein=new Levenshtein();
        JaroWinkler jaroWinkler = new JaroWinkler();
        List<String> result = new ArrayList<>();
        URL url1 = new URL(url);

        URLConnection request = url1.openConnection();
        request.connect();
        JsonParser jsonParser = new JsonParser();
        JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonArray array = root.getAsJsonArray();

        for (JsonElement element : array) {
            JsonObject object = element.getAsJsonObject();
            String country = object.get("country").getAsString();
            String name = object.get("name").getAsString();

            if (country.equals("ID")&&jaroWinkler.distance(name,input)<=0.26){
                result.add(name);
            }
        }
        return result;
    }
}
