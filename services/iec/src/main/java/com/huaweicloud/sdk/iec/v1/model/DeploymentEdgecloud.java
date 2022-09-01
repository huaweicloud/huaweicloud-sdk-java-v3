package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class DeploymentEdgecloud {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stacks")

    @JacksonXmlProperty(localName = "stacks")

    private Stack stacks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    @JacksonXmlProperty(localName = "coverage")

    private Coverage coverage;

    public DeploymentEdgecloud withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘业务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeploymentEdgecloud withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘业务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentEdgecloud withStacks(Stack stacks) {
        this.stacks = stacks;
        return this;
    }

    public DeploymentEdgecloud withStacks(Consumer<Stack> stacksSetter) {
        if (this.stacks == null) {
            this.stacks = new Stack();
            stacksSetter.accept(this.stacks);
        }

        return this;
    }

    /**
     * Get stacks
     * @return stacks
     */
    public Stack getStacks() {
        return stacks;
    }

    public void setStacks(Stack stacks) {
        this.stacks = stacks;
    }

    public DeploymentEdgecloud withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘业务描述，最大支持255字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentEdgecloud withCoverage(Coverage coverage) {
        this.coverage = coverage;
        return this;
    }

    public DeploymentEdgecloud withCoverage(Consumer<Coverage> coverageSetter) {
        if (this.coverage == null) {
            this.coverage = new Coverage();
            coverageSetter.accept(this.coverage);
        }

        return this;
    }

    /**
     * Get coverage
     * @return coverage
     */
    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentEdgecloud deploymentEdgecloud = (DeploymentEdgecloud) o;
        return Objects.equals(this.id, deploymentEdgecloud.id) && Objects.equals(this.name, deploymentEdgecloud.name)
            && Objects.equals(this.stacks, deploymentEdgecloud.stacks)
            && Objects.equals(this.description, deploymentEdgecloud.description)
            && Objects.equals(this.coverage, deploymentEdgecloud.coverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stacks, description, coverage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentEdgecloud {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
