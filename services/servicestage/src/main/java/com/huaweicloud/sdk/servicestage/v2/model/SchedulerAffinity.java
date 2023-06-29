package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SchedulerAffinity
 */
public class SchedulerAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private List<String> az = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private List<String> node = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private List<String> application = null;

    public SchedulerAffinity withAz(List<String> az) {
        this.az = az;
        return this;
    }

    public SchedulerAffinity addAzItem(String azItem) {
        if (this.az == null) {
            this.az = new ArrayList<>();
        }
        this.az.add(azItem);
        return this;
    }

    public SchedulerAffinity withAz(Consumer<List<String>> azSetter) {
        if (this.az == null) {
            this.az = new ArrayList<>();
        }
        azSetter.accept(this.az);
        return this;
    }

    /**
     * Get az
     * @return az
     */
    public List<String> getAz() {
        return az;
    }

    public void setAz(List<String> az) {
        this.az = az;
    }

    public SchedulerAffinity withNode(List<String> node) {
        this.node = node;
        return this;
    }

    public SchedulerAffinity addNodeItem(String nodeItem) {
        if (this.node == null) {
            this.node = new ArrayList<>();
        }
        this.node.add(nodeItem);
        return this;
    }

    public SchedulerAffinity withNode(Consumer<List<String>> nodeSetter) {
        if (this.node == null) {
            this.node = new ArrayList<>();
        }
        nodeSetter.accept(this.node);
        return this;
    }

    /**
     * Get node
     * @return node
     */
    public List<String> getNode() {
        return node;
    }

    public void setNode(List<String> node) {
        this.node = node;
    }

    public SchedulerAffinity withApplication(List<String> application) {
        this.application = application;
        return this;
    }

    public SchedulerAffinity addApplicationItem(String applicationItem) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        this.application.add(applicationItem);
        return this;
    }

    public SchedulerAffinity withApplication(Consumer<List<String>> applicationSetter) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        applicationSetter.accept(this.application);
        return this;
    }

    /**
     * Get application
     * @return application
     */
    public List<String> getApplication() {
        return application;
    }

    public void setApplication(List<String> application) {
        this.application = application;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchedulerAffinity that = (SchedulerAffinity) obj;
        return Objects.equals(this.az, that.az) && Objects.equals(this.node, that.node)
            && Objects.equals(this.application, that.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(az, node, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulerAffinity {\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
