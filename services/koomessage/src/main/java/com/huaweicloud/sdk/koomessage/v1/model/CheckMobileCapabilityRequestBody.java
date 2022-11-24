package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 校验AIM能力消息体。
 */
public class CheckMobileCapabilityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobiles")

    private List<String> mobiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_alg")

    private String encryptionAlg;

    public CheckMobileCapabilityRequestBody withMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
        return this;
    }

    public CheckMobileCapabilityRequestBody addMobilesItem(String mobilesItem) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        this.mobiles.add(mobilesItem);
        return this;
    }

    public CheckMobileCapabilityRequestBody withMobiles(Consumer<List<String>> mobilesSetter) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        mobilesSetter.accept(this.mobiles);
        return this;
    }

    /**
     * 待查询的手机号码，一次最多请求100个。  >不加密时，参数可传入纯手机号或国家码加手机号，国家码不带“+”号，例如国内手机号“13100000000”，参数可传入“13100000000”、“8613100000000”、“008613100000000”。使用SHA1加密，mobiles传入号码国家码与手机号码的SHA1算法后的摘要，国家码格式为纯数字，不带“+”，去掉前面的0，例如国内手机号“13100000000”，使用“8613100000000”进行SHA1加密。 
     * @return mobiles
     */
    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public CheckMobileCapabilityRequestBody withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID，由9位数字组成。 > - 填写时，根据该模板所支持的厂商返回手机终端展示智能信息的能力状态 > - 不填则返回手机终端在所有厂商展示智能信息的能力状态 
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CheckMobileCapabilityRequestBody withEncryptionAlg(String encryptionAlg) {
        this.encryptionAlg = encryptionAlg;
        return this;
    }

    /**
     * 加密类型。  - NONE：不加密 - SHA1：使用SHA1加密算法加密  > 默认为NONE。 
     * @return encryptionAlg
     */
    public String getEncryptionAlg() {
        return encryptionAlg;
    }

    public void setEncryptionAlg(String encryptionAlg) {
        this.encryptionAlg = encryptionAlg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckMobileCapabilityRequestBody checkMobileCapabilityRequestBody = (CheckMobileCapabilityRequestBody) o;
        return Objects.equals(this.mobiles, checkMobileCapabilityRequestBody.mobiles)
            && Objects.equals(this.tplId, checkMobileCapabilityRequestBody.tplId)
            && Objects.equals(this.encryptionAlg, checkMobileCapabilityRequestBody.encryptionAlg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobiles, tplId, encryptionAlg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMobileCapabilityRequestBody {\n");
        sb.append("    mobiles: ").append(toIndentedString(mobiles)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    encryptionAlg: ").append(toIndentedString(encryptionAlg)).append("\n");
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
