package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> subscribdContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();


    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribdContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progressBootcamp(){
        Optional<Content> content = this.subscribdContents.stream().findFirst();
        if(content.isPresent()){
            this.finishedContents.add(content.get());
            this.subscribdContents.remove(content.get());
        }else System.err.println("Sem nenhuma matrícula ativa");
    }

    public double calculateAllXp(){
        return this.finishedContents
                .stream()
                .mapToDouble(content -> content.calculate_Xp())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribdContents() {
        return subscribdContents;
    }

    public void setSubscribdContents(Set<Content> subscribdContents) {
        this.subscribdContents = subscribdContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribdContents, developer.subscribdContents) && Objects.equals(finishedContents, developer.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribdContents, finishedContents);
    }
}