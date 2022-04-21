package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户信息。
 */
public class AddUserDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdAccount")

    private String thirdAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

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
     * 用户状态 * 0、正常 * 1、停用 默认值：0
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
    @JsonProperty(value = "function")

    private UserFunctionDTO function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendNotify")

    private String sendNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    private Integer sortLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidePhone")

    private Boolean hidePhone;

    public AddUserDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业用户姓名。 maxLength：64 minLength：1
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddUserDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /**
     * 企业用户的英文姓名。 maxLength：64 minLength：0
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public AddUserDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 企业用户帐号，若携带则以携带为准，否则后台自动生成。账号整系统唯一 帐号只能包含大小写字母、数字、_、-、.、@符号，不能为纯数字和@后面带.号。 maxLength：64 minLength：0
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AddUserDTO withThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
        return this;
    }

    /**
     * 指定第三方账号开户
     * @return thirdAccount
     */
    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
    }

    public AddUserDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号，必须加上国家码。 例如中国大陆手机+86xxxxxxx。当填写手机号时 “country”参数必填。 手机号只允许输入纯数字。 说明：手机号或者邮箱至少填写一个 maxLength：32 minLength：0
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddUserDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddUserDTO withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * 企业用户帐号的密码。若携带则以实际携带为准，否则后台默认生成，密码必须满足： 1、8-32位 2、不能和账号的正序和倒序一致 3、至少包含两种字符类型：小写字母、大写字母、数字、特殊字符（` ~ ! @ # $ % ^ & * ( ) - _ = + | [ { } ] ; : \" ,’ < . > / ?）
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public AddUserDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱 maxLength：255 minLength：0
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddUserDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编号，若不携带则默认根部门 默认值：1 maxLength：32 minLength：0
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public AddUserDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名 maxLength：512 minLength：0
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public AddUserDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位 maxLength：32 minLength：0
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AddUserDTO withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注 maxLength：128 minLength：0
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AddUserDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 用户状态 * 0、正常 * 1、停用 默认值：0
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AddUserDTO withFunction(UserFunctionDTO function) {
        this.function = function;
        return this;
    }

    public AddUserDTO withFunction(Consumer<UserFunctionDTO> functionSetter) {
        if (this.function == null) {
            this.function = new UserFunctionDTO();
            functionSetter.accept(this.function);
        }

        return this;
    }

    /**
     * Get function
     * @return function
     */
    public UserFunctionDTO getFunction() {
        return function;
    }

    public void setFunction(UserFunctionDTO function) {
        this.function = function;
    }

    public AddUserDTO withSendNotify(String sendNotify) {
        this.sendNotify = sendNotify;
        return this;
    }

    /**
     * 是否发送邮件和短信通知， - 0 不发送 - 不填或者其他值就发送, 默认发送  约束 - 长度范围为0到32个字符
     * @return sendNotify
     */
    public String getSendNotify() {
        return sendNotify;
    }

    public void setSendNotify(String sendNotify) {
        this.sendNotify = sendNotify;
    }

    public AddUserDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 通讯录排序等级，序号越低优先级越高。 默认值：10000 maximum：10000 minimum：1
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public AddUserDTO withHidePhone(Boolean hidePhone) {
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
        AddUserDTO addUserDTO = (AddUserDTO) o;
        return Objects.equals(this.name, addUserDTO.name) && Objects.equals(this.englishName, addUserDTO.englishName)
            && Objects.equals(this.account, addUserDTO.account)
            && Objects.equals(this.thirdAccount, addUserDTO.thirdAccount)
            && Objects.equals(this.phone, addUserDTO.phone) && Objects.equals(this.country, addUserDTO.country)
            && Objects.equals(this.pwd, addUserDTO.pwd) && Objects.equals(this.email, addUserDTO.email)
            && Objects.equals(this.deptCode, addUserDTO.deptCode)
            && Objects.equals(this.signature, addUserDTO.signature) && Objects.equals(this.title, addUserDTO.title)
            && Objects.equals(this.desc, addUserDTO.desc) && Objects.equals(this.status, addUserDTO.status)
            && Objects.equals(this.function, addUserDTO.function)
            && Objects.equals(this.sendNotify, addUserDTO.sendNotify)
            && Objects.equals(this.sortLevel, addUserDTO.sortLevel)
            && Objects.equals(this.hidePhone, addUserDTO.hidePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            englishName,
            account,
            thirdAccount,
            phone,
            country,
            pwd,
            email,
            deptCode,
            signature,
            title,
            desc,
            status,
            function,
            sendNotify,
            sortLevel,
            hidePhone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddUserDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    thirdAccount: ").append(toIndentedString(thirdAccount)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    sendNotify: ").append(toIndentedString(sendNotify)).append("\n");
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
