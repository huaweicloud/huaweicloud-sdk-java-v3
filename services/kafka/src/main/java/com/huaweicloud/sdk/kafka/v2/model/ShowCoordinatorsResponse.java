package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCoordinatorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinators")

    @JacksonXmlProperty(localName = "coordinators")

    private List<ShowCoordinatorsRespCoordinators> coordinators = null;

    public ShowCoordinatorsResponse withCoordinators(List<ShowCoordinatorsRespCoordinators> coordinators) {
        this.coordinators = coordinators;
        return this;
    }

    public ShowCoordinatorsResponse addCoordinatorsItem(ShowCoordinatorsRespCoordinators coordinatorsItem) {
        if (this.coordinators == null) {
            this.coordinators = new ArrayList<>();
        }
        this.coordinators.add(coordinatorsItem);
        return this;
    }

    public ShowCoordinatorsResponse withCoordinators(
        Consumer<List<ShowCoordinatorsRespCoordinators>> coordinatorsSetter) {
        if (this.coordinators == null) {
            this.coordinators = new ArrayList<>();
        }
        coordinatorsSetter.accept(this.coordinators);
        return this;
    }

    /**
     * 所有消费组对应的协调器列表。
     * @return coordinators
     */
    public List<ShowCoordinatorsRespCoordinators> getCoordinators() {
        return coordinators;
    }

    public void setCoordinators(List<ShowCoordinatorsRespCoordinators> coordinators) {
        this.coordinators = coordinators;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCoordinatorsResponse showCoordinatorsResponse = (ShowCoordinatorsResponse) o;
        return Objects.equals(this.coordinators, showCoordinatorsResponse.coordinators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCoordinatorsResponse {\n");
        sb.append("    coordinators: ").append(toIndentedString(coordinators)).append("\n");
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
