package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用户信息。
 */
public class ModUserDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    /**
     * 用户状态。默认值：0。 * 0：正常 * 1：停用
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    private Integer sortLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidePhone")

    private Boolean hidePhone;

    public ModUserDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModUserDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /**
     * 企业用户的英文名称。
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public ModUserDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号，必须加上国家码。 例如中国大陆手机为“+86xxxxxxxxxxx”。当填写手机号时 “country”参数必填。 手机号只允许输入纯数字。 说明：手机号或者邮箱至少填写一个。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ModUserDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * [[手机号所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ModUserDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ModUserDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /**
     * 个人会议ID，若不携带则后台默认生成。
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public ModUserDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 个人会议ID，若不携带则后台默认生成。 默认值：1
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ModUserDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名。
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public ModUserDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ModUserDTO withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ModUserDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 用户状态。默认值：0。 * 0：正常 * 1：停用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ModUserDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 通讯录排序等级，序号越低优先级越高。 默认值：10000
     * minimum: 1
     * maximum: 10000
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public ModUserDTO withHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
        return this;
    }

    /**
     * 是否隐藏手机号码 默认值：false 
     * @return hidePhone
     */
    public Boolean getHidePhone() {
        return hidePhone;
    }

    public void setHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModUserDTO modUserDTO = (ModUserDTO) o;
        return Objects.equals(this.name, modUserDTO.name) && Objects.equals(this.englishName, modUserDTO.englishName)
            && Objects.equals(this.phone, modUserDTO.phone) && Objects.equals(this.country, modUserDTO.country)
            && Objects.equals(this.email, modUserDTO.email) && Objects.equals(this.vmrId, modUserDTO.vmrId)
            && Objects.equals(this.deptCode, modUserDTO.deptCode)
            && Objects.equals(this.signature, modUserDTO.signature) && Objects.equals(this.title, modUserDTO.title)
            && Objects.equals(this.desc, modUserDTO.desc) && Objects.equals(this.status, modUserDTO.status)
            && Objects.equals(this.sortLevel, modUserDTO.sortLevel)
            && Objects.equals(this.hidePhone, modUserDTO.hidePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            englishName,
            phone,
            country,
            email,
            vmrId,
            deptCode,
            signature,
            title,
            desc,
            status,
            sortLevel,
            hidePhone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModUserDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
        sb.append("    hidePhone: ").append(toIndentedString(hidePhone)).append("\n");
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
