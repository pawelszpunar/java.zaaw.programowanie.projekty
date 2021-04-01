package com.sda.zdjavapol68.example.zad18;

import java.util.Objects;

public class Computer {
    private String processor;
    private String ramMemory;
    private String graphicCard;
    private String company;
    private String model;

    public Computer(String processor, String ramMemory, String graphicCard, String company, String model) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ramMemory='" + ramMemory + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor)
                && Objects.equals(ramMemory, computer.ramMemory)
                && Objects.equals(graphicCard, computer.graphicCard)
                && Objects.equals(company, computer.company)
                && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ramMemory, graphicCard, company, model);
    }
}
