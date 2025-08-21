package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 响应信息 **取值范围**： 不涉及
 */
public class EnableMultiAccountRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_service_status")

    private Integer trustServiceStatus;

    public EnableMultiAccountRespData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnableMultiAccountRespData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 防火墙名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnableMultiAccountRespData withTrustServiceStatus(Integer trustServiceStatus) {
        this.trustServiceStatus = trustServiceStatus;
        return this;
    }

    /**
     * **参数解释**： 云防火墙可信服务状态 **取值范围**： 1 已开启
     * @return trustServiceStatus
     */
    public Integer getTrustServiceStatus() {
        return trustServiceStatus;
    }

    public void setTrustServiceStatus(Integer trustServiceStatus) {
        this.trustServiceStatus = trustServiceStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableMultiAccountRespData that = (EnableMultiAccountRespData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.trustServiceStatus, that.trustServiceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, trustServiceStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableMultiAccountRespData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    trustServiceStatus: ").append(toIndentedString(trustServiceStatus)).append("\n");
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
