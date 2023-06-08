package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyApplicationRequestBody
 */
public class ModifyApplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_user_list")

    private List<AppUserList> appUserList = null;

    public ModifyApplicationRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModifyApplicationRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用的中文描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyApplicationRequestBody withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 应用的英文描述。
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public ModifyApplicationRequestBody withAppUserList(List<AppUserList> appUserList) {
        this.appUserList = appUserList;
        return this;
    }

    public ModifyApplicationRequestBody addAppUserListItem(AppUserList appUserListItem) {
        if (this.appUserList == null) {
            this.appUserList = new ArrayList<>();
        }
        this.appUserList.add(appUserListItem);
        return this;
    }

    public ModifyApplicationRequestBody withAppUserList(Consumer<List<AppUserList>> appUserListSetter) {
        if (this.appUserList == null) {
            this.appUserList = new ArrayList<>();
        }
        appUserListSetter.accept(this.appUserList);
        return this;
    }

    /**
     * 应用责任人。
     * @return appUserList
     */
    public List<AppUserList> getAppUserList() {
        return appUserList;
    }

    public void setAppUserList(List<AppUserList> appUserList) {
        this.appUserList = appUserList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyApplicationRequestBody modifyApplicationRequestBody = (ModifyApplicationRequestBody) o;
        return Objects.equals(this.id, modifyApplicationRequestBody.id)
            && Objects.equals(this.description, modifyApplicationRequestBody.description)
            && Objects.equals(this.descriptionEn, modifyApplicationRequestBody.descriptionEn)
            && Objects.equals(this.appUserList, modifyApplicationRequestBody.appUserList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, descriptionEn, appUserList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyApplicationRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    appUserList: ").append(toIndentedString(appUserList)).append("\n");
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
