package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUserGpgKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emails_with_verified_status")

    private Map<String, Boolean> emailsWithVerifiedStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_keyid")

    private String primaryKeyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subkeys")

    private List<GpgSubKeyDto> subkeys = null;

    public ListUserGpgKeysResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记录id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListUserGpgKeysResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListUserGpgKeysResponse withEmailsWithVerifiedStatus(Map<String, Boolean> emailsWithVerifiedStatus) {
        this.emailsWithVerifiedStatus = emailsWithVerifiedStatus;
        return this;
    }

    public ListUserGpgKeysResponse putEmailsWithVerifiedStatusItem(String key, Boolean emailsWithVerifiedStatusItem) {
        if (this.emailsWithVerifiedStatus == null) {
            this.emailsWithVerifiedStatus = new HashMap<>();
        }
        this.emailsWithVerifiedStatus.put(key, emailsWithVerifiedStatusItem);
        return this;
    }

    public ListUserGpgKeysResponse withEmailsWithVerifiedStatus(
        Consumer<Map<String, Boolean>> emailsWithVerifiedStatusSetter) {
        if (this.emailsWithVerifiedStatus == null) {
            this.emailsWithVerifiedStatus = new HashMap<>();
        }
        emailsWithVerifiedStatusSetter.accept(this.emailsWithVerifiedStatus);
        return this;
    }

    /**
     * **参数解释：** 解析到的邮箱列表以及是否生效。
     * @return emailsWithVerifiedStatus
     */
    public Map<String, Boolean> getEmailsWithVerifiedStatus() {
        return emailsWithVerifiedStatus;
    }

    public void setEmailsWithVerifiedStatus(Map<String, Boolean> emailsWithVerifiedStatus) {
        this.emailsWithVerifiedStatus = emailsWithVerifiedStatus;
    }

    public ListUserGpgKeysResponse withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * **参数解释：** 主密/公钥的指纹格式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public ListUserGpgKeysResponse withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** gpg的公钥。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ListUserGpgKeysResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListUserGpgKeysResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** gpg_key的标题。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListUserGpgKeysResponse withPrimaryKeyid(String primaryKeyid) {
        this.primaryKeyid = primaryKeyid;
        return this;
    }

    /**
     * **参数解释：** 主密/公钥primary_key的id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return primaryKeyid
     */
    public String getPrimaryKeyid() {
        return primaryKeyid;
    }

    public void setPrimaryKeyid(String primaryKeyid) {
        this.primaryKeyid = primaryKeyid;
    }

    public ListUserGpgKeysResponse withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释：** 是否生效。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ListUserGpgKeysResponse withSubkeys(List<GpgSubKeyDto> subkeys) {
        this.subkeys = subkeys;
        return this;
    }

    public ListUserGpgKeysResponse addSubkeysItem(GpgSubKeyDto subkeysItem) {
        if (this.subkeys == null) {
            this.subkeys = new ArrayList<>();
        }
        this.subkeys.add(subkeysItem);
        return this;
    }

    public ListUserGpgKeysResponse withSubkeys(Consumer<List<GpgSubKeyDto>> subkeysSetter) {
        if (this.subkeys == null) {
            this.subkeys = new ArrayList<>();
        }
        subkeysSetter.accept(this.subkeys);
        return this;
    }

    /**
     * **参数解释：** 子钥列表。 **取值范围：** 列表长度不少于0，不超过1000。
     * @return subkeys
     */
    public List<GpgSubKeyDto> getSubkeys() {
        return subkeys;
    }

    public void setSubkeys(List<GpgSubKeyDto> subkeys) {
        this.subkeys = subkeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserGpgKeysResponse that = (ListUserGpgKeysResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.emailsWithVerifiedStatus, that.emailsWithVerifiedStatus)
            && Objects.equals(this.fingerprint, that.fingerprint) && Objects.equals(this.key, that.key)
            && Objects.equals(this.description, that.description) && Objects.equals(this.title, that.title)
            && Objects.equals(this.primaryKeyid, that.primaryKeyid) && Objects.equals(this.active, that.active)
            && Objects.equals(this.subkeys, that.subkeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createdAt,
            emailsWithVerifiedStatus,
            fingerprint,
            key,
            description,
            title,
            primaryKeyid,
            active,
            subkeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserGpgKeysResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    emailsWithVerifiedStatus: ").append(toIndentedString(emailsWithVerifiedStatus)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    primaryKeyid: ").append(toIndentedString(primaryKeyid)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    subkeys: ").append(toIndentedString(subkeys)).append("\n");
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
