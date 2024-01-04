package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMrsFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_flavors")

    private List<AzFlavors> availableFlavors = null;

    public ShowMrsFlavorsResponse withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本名称
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public ShowMrsFlavorsResponse withAvailableFlavors(List<AzFlavors> availableFlavors) {
        this.availableFlavors = availableFlavors;
        return this;
    }

    public ShowMrsFlavorsResponse addAvailableFlavorsItem(AzFlavors availableFlavorsItem) {
        if (this.availableFlavors == null) {
            this.availableFlavors = new ArrayList<>();
        }
        this.availableFlavors.add(availableFlavorsItem);
        return this;
    }

    public ShowMrsFlavorsResponse withAvailableFlavors(Consumer<List<AzFlavors>> availableFlavorsSetter) {
        if (this.availableFlavors == null) {
            this.availableFlavors = new ArrayList<>();
        }
        availableFlavorsSetter.accept(this.availableFlavors);
        return this;
    }

    /**
     * 不同可用区支持的规格列表
     * @return availableFlavors
     */
    public List<AzFlavors> getAvailableFlavors() {
        return availableFlavors;
    }

    public void setAvailableFlavors(List<AzFlavors> availableFlavors) {
        this.availableFlavors = availableFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMrsFlavorsResponse that = (ShowMrsFlavorsResponse) obj;
        return Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.availableFlavors, that.availableFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionName, availableFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMrsFlavorsResponse {\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    availableFlavors: ").append(toIndentedString(availableFlavors)).append("\n");
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
