package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 终端信息。 */
public class AddDeviceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sn")

    private String sn;

    /** 投影码生成模式，默认为自动 - 0、自动(该模式下根据消息上报的IP地址内部控制复杂度： 私网地址配置成简单模式；公网地址配置成复杂模式) - 1、简单 - 2、复杂 */
    public static final class PrjCodeModeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final PrjCodeModeEnum NUMBER_0 = new PrjCodeModeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final PrjCodeModeEnum NUMBER_1 = new PrjCodeModeEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final PrjCodeModeEnum NUMBER_2 = new PrjCodeModeEnum(2);

        private static final Map<Integer, PrjCodeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PrjCodeModeEnum> createStaticFields() {
            Map<Integer, PrjCodeModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PrjCodeModeEnum(Integer value) {
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
        public static PrjCodeModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            PrjCodeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrjCodeModeEnum(value);
            }
            return result;
        }

        public static PrjCodeModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            PrjCodeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrjCodeModeEnum) {
                return this.value.equals(((PrjCodeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prjCodeMode")

    private PrjCodeModeEnum prjCodeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

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
    @JsonProperty(value = "description")

    private String description;

    /** 终端状态 * 0、正常 * 1、冻结\" 默认值：0。 */
    public static final class StatusEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /** Enum NUMBER_1 for value: 1 */
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
    @JsonProperty(value = "sendNotify")

    private String sendNotify;

    public AddDeviceDTO withName(String name) {
        this.name = name;
        return this;
    }

    /** 终端名称，可以自定义，建议为具体位置，方便识别。 maxLength：64 minLength：1
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddDeviceDTO withModel(String model) {
        this.model = model;
        return this;
    }

    /** 终端型号，枚举类型。当前支持TE系列和部分第三方硬件终端，具体的终端类型可以通过获取所有终端类型接口查询。 maxLength：128 minLength：1
     * 
     * @return model */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AddDeviceDTO withSn(String sn) {
        this.sn = sn;
        return this;
    }

    /** 终端SN码，仅可包含数字、字母和下划线。 maxLength：30 minLength：1
     * 
     * @return sn */
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public AddDeviceDTO withPrjCodeMode(PrjCodeModeEnum prjCodeMode) {
        this.prjCodeMode = prjCodeMode;
        return this;
    }

    /** 投影码生成模式，默认为自动 - 0、自动(该模式下根据消息上报的IP地址内部控制复杂度： 私网地址配置成简单模式；公网地址配置成复杂模式) - 1、简单 - 2、复杂
     * 
     * @return prjCodeMode */
    public PrjCodeModeEnum getPrjCodeMode() {
        return prjCodeMode;
    }

    public void setPrjCodeMode(PrjCodeModeEnum prjCodeMode) {
        this.prjCodeMode = prjCodeMode;
    }

    public AddDeviceDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /** 部门编号，默认为根部门 默认值：1 maxLength：32 minLength：1
     * 
     * @return deptCode */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public AddDeviceDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /** 手机号，必须加上国家码，例如中国大陆手机为“+86xxxxxxxxxxx”。当填写手机号时 “country”参数必填。 手机号只允许输入纯数字。 maxLength：32 minLength：0 说明： -
     * 手机号或者邮箱至少填写一个。
     * 
     * @return phone */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddDeviceDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR
     * 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddDeviceDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 统一邮箱格式 maxLength：255 minLength：0
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddDeviceDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 终端描述 maxLength：128 minLength：0
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDeviceDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 终端状态 * 0、正常 * 1、冻结\" 默认值：0。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AddDeviceDTO withSendNotify(String sendNotify) {
        this.sendNotify = sendNotify;
        return this;
    }

    /** 是否发送邮件和短信通知。 * 0：不发送 * 不填或者其他值就发送
     * 
     * @return sendNotify */
    public String getSendNotify() {
        return sendNotify;
    }

    public void setSendNotify(String sendNotify) {
        this.sendNotify = sendNotify;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDeviceDTO addDeviceDTO = (AddDeviceDTO) o;
        return Objects.equals(this.name, addDeviceDTO.name) && Objects.equals(this.model, addDeviceDTO.model)
            && Objects.equals(this.sn, addDeviceDTO.sn) && Objects.equals(this.prjCodeMode, addDeviceDTO.prjCodeMode)
            && Objects.equals(this.deptCode, addDeviceDTO.deptCode) && Objects.equals(this.phone, addDeviceDTO.phone)
            && Objects.equals(this.country, addDeviceDTO.country) && Objects.equals(this.email, addDeviceDTO.email)
            && Objects.equals(this.description, addDeviceDTO.description)
            && Objects.equals(this.status, addDeviceDTO.status)
            && Objects.equals(this.sendNotify, addDeviceDTO.sendNotify);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, model, sn, prjCodeMode, deptCode, phone, country, email, description, status, sendNotify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeviceDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
        sb.append("    prjCodeMode: ").append(toIndentedString(prjCodeMode)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sendNotify: ").append(toIndentedString(sendNotify)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
