package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddEipAlarmWhitelistRequestBody
 */
public class AddEipAlarmWhitelistRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_infos")

    private List<EipInfo> eipInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    public AddEipAlarmWhitelistRequestBody withEipInfos(List<EipInfo> eipInfos) {
        this.eipInfos = eipInfos;
        return this;
    }

    public AddEipAlarmWhitelistRequestBody addEipInfosItem(EipInfo eipInfosItem) {
        if (this.eipInfos == null) {
            this.eipInfos = new ArrayList<>();
        }
        this.eipInfos.add(eipInfosItem);
        return this;
    }

    public AddEipAlarmWhitelistRequestBody withEipInfos(Consumer<List<EipInfo>> eipInfosSetter) {
        if (this.eipInfos == null) {
            this.eipInfos = new ArrayList<>();
        }
        eipInfosSetter.accept(this.eipInfos);
        return this;
    }

    /**
     * **参数解释**： EIP详情 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return eipInfos
     */
    public List<EipInfo> getEipInfos() {
        return eipInfos;
    }

    public void setEipInfos(List<EipInfo> eipInfos) {
        this.eipInfos = eipInfos;
    }

    public AddEipAlarmWhitelistRequestBody withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEipAlarmWhitelistRequestBody that = (AddEipAlarmWhitelistRequestBody) obj;
        return Objects.equals(this.eipInfos, that.eipInfos) && Objects.equals(this.fwInstanceId, that.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipInfos, fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEipAlarmWhitelistRequestBody {\n");
        sb.append("    eipInfos: ").append(toIndentedString(eipInfos)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
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
