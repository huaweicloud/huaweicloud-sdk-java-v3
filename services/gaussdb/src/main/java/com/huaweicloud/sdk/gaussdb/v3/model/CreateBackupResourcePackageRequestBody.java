package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**:  创建备份资源包请求体。
 */
public class CreateBackupResourcePackageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private TaurusDbChargeInfo chargeInfo;

    public CreateBackupResourcePackageRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：  备份资源包规格码。  **约束限制**：  不涉及。  **取值范围**：  备份资源包规格码可根据[查询备份资源包规格](https://support.huaweicloud.com/api-taurusdb/ShowBackupResourcePackageFlavors.html)接口获取。  **默认取值**：  不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateBackupResourcePackageRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**：  备份资源包数量。  **约束限制**：  不涉及。  **取值范围**：  1-10。  **默认取值**：  不涉及。
     * minimum: 1
     * maximum: 10
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public CreateBackupResourcePackageRequestBody withChargeInfo(TaurusDbChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateBackupResourcePackageRequestBody withChargeInfo(Consumer<TaurusDbChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new TaurusDbChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public TaurusDbChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(TaurusDbChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBackupResourcePackageRequestBody that = (CreateBackupResourcePackageRequestBody) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.num, that.num)
            && Objects.equals(this.chargeInfo, that.chargeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, num, chargeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBackupResourcePackageRequestBody {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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
