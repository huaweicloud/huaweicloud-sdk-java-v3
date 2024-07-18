package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 在线会议信息。
 */
public class RealTimeConfInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairID")

    private String chairID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coHosts")

    private List<String> coHosts = null;

    public RealTimeConfInfo withChairID(String chairID) {
        this.chairID = chairID;
        return this;
    }

    /**
     * 主持人与会者标识。
     * @return chairID
     */
    public String getChairID() {
        return chairID;
    }

    public void setChairID(String chairID) {
        this.chairID = chairID;
    }

    public RealTimeConfInfo withCoHosts(List<String> coHosts) {
        this.coHosts = coHosts;
        return this;
    }

    public RealTimeConfInfo addCoHostsItem(String coHostsItem) {
        if (this.coHosts == null) {
            this.coHosts = new ArrayList<>();
        }
        this.coHosts.add(coHostsItem);
        return this;
    }

    public RealTimeConfInfo withCoHosts(Consumer<List<String>> coHostsSetter) {
        if (this.coHosts == null) {
            this.coHosts = new ArrayList<>();
        }
        coHostsSetter.accept(this.coHosts);
        return this;
    }

    /**
     * 联席主持人会场id。
     * @return coHosts
     */
    public List<String> getCoHosts() {
        return coHosts;
    }

    public void setCoHosts(List<String> coHosts) {
        this.coHosts = coHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealTimeConfInfo that = (RealTimeConfInfo) obj;
        return Objects.equals(this.chairID, that.chairID) && Objects.equals(this.coHosts, that.coHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chairID, coHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeConfInfo {\n");
        sb.append("    chairID: ").append(toIndentedString(chairID)).append("\n");
        sb.append("    coHosts: ").append(toIndentedString(coHosts)).append("\n");
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
