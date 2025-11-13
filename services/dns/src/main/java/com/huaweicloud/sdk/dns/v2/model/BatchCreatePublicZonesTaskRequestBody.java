package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreatePublicZonesTaskRequestBody
 */
public class BatchCreatePublicZonesTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_names")

    private List<String> zoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public BatchCreatePublicZonesTaskRequestBody withZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public BatchCreatePublicZonesTaskRequestBody addZoneNamesItem(String zoneNamesItem) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        this.zoneNames.add(zoneNamesItem);
        return this;
    }

    public BatchCreatePublicZonesTaskRequestBody withZoneNames(Consumer<List<String>> zoneNamesSetter) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        zoneNamesSetter.accept(this.zoneNames);
        return this;
    }

    /**
     * **参数解释：** 域名。 **约束限制：** 不涉及。 **取值范围：** 由多个以点分隔的字符串组成，可包含字母、数字、汉字、中划线，中划线不能在开头或末尾，单个字符串不超过63个字符，域名总长度不超过254个字符。 **默认取值：** 不涉及。
     * @return zoneNames
     */
    public List<String> getZoneNames() {
        return zoneNames;
    }

    public void setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
    }

    public BatchCreatePublicZonesTaskRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 域名所属的企业项目ID。可以使用该字段过滤企业项目下的域名。 **约束限制：** 不涉及。 **取值范围：** 最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 **默认取值：** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreatePublicZonesTaskRequestBody that = (BatchCreatePublicZonesTaskRequestBody) obj;
        return Objects.equals(this.zoneNames, that.zoneNames)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneNames, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreatePublicZonesTaskRequestBody {\n");
        sb.append("    zoneNames: ").append(toIndentedString(zoneNames)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
