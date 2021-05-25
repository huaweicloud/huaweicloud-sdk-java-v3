package com.huaweicloud.sdk.rabbitmq.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowMaintainWindowsRespMaintainWindows;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMaintainWindowsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_windows")
    
    private List<ShowMaintainWindowsRespMaintainWindows> maintainWindows = null;
    
    public ShowMaintainWindowsResponse withMaintainWindows(List<ShowMaintainWindowsRespMaintainWindows> maintainWindows) {
        this.maintainWindows = maintainWindows;
        return this;
    }

    
    public ShowMaintainWindowsResponse addMaintainWindowsItem(ShowMaintainWindowsRespMaintainWindows maintainWindowsItem) {
        if(this.maintainWindows == null) {
            this.maintainWindows = new ArrayList<>();
        }
        this.maintainWindows.add(maintainWindowsItem);
        return this;
    }

    public ShowMaintainWindowsResponse withMaintainWindows(Consumer<List<ShowMaintainWindowsRespMaintainWindows>> maintainWindowsSetter) {
        if(this.maintainWindows == null) {
            this.maintainWindows = new ArrayList<>();
        }
        maintainWindowsSetter.accept(this.maintainWindows);
        return this;
    }

    /**
     * 支持的维护时间窗列表。
     * @return maintainWindows
     */
    public List<ShowMaintainWindowsRespMaintainWindows> getMaintainWindows() {
        return maintainWindows;
    }

    public void setMaintainWindows(List<ShowMaintainWindowsRespMaintainWindows> maintainWindows) {
        this.maintainWindows = maintainWindows;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMaintainWindowsResponse showMaintainWindowsResponse = (ShowMaintainWindowsResponse) o;
        return Objects.equals(this.maintainWindows, showMaintainWindowsResponse.maintainWindows);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maintainWindows);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMaintainWindowsResponse {\n");
        sb.append("    maintainWindows: ").append(toIndentedString(maintainWindows)).append("\n");
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

