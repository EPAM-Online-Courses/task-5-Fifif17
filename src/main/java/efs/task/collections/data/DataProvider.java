package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> townList = new ArrayList<>();

        for (String el : Data.baseTownsArray) {
            String[] values = el.split(DATA_SEPARATOR);
            Town town = new Town(values[0].trim(), Arrays.asList(values[1].trim(), values[2].trim()));
            townList.add(town);
        }

        return townList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> townList = new ArrayList<>();

        for (String el : Data.dlcTownsArray) {
            String[] values = el.split(DATA_SEPARATOR);
            Town town = new Town(values[0].trim(), Arrays.asList(values[1].trim(), values[2].trim()));
            townList.add(town);
        }

        return townList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroSet = new HashSet<>();

        for (String el : Data.baseCharactersArray) {
            String[] values = el.split(DATA_SEPARATOR);
            Hero hero = new Hero(values[0].trim(), values[1].trim());
            heroSet.add(hero);
        }

        return heroSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> heroSet = new HashSet<>();

        for (String el : Data.dlcCharactersArray) {
            String[] values = el.split(DATA_SEPARATOR);
            Hero hero = new Hero(values[0].trim(), values[1].trim());
            heroSet.add(hero);
        }
        
        return heroSet;
    }
}
