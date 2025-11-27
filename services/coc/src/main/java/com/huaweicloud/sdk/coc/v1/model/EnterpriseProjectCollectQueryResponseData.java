package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EnterpriseProjectCollectQueryResponseData
 */
public class EnterpriseProjectCollectQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id_list")

    private List<String> epIdList = null;

    public EnterpriseProjectCollectQueryResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 唯一标识id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnterpriseProjectCollectQueryResponseData withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 用户id。 **取值范围：** 不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EnterpriseProjectCollectQueryResponseData withEpIdList(List<String> epIdList) {
        this.epIdList = epIdList;
        return this;
    }

    public EnterpriseProjectCollectQueryResponseData addEpIdListItem(String epIdListItem) {
        if (this.epIdList == null) {
            this.epIdList = new ArrayList<>();
        }
        this.epIdList.add(epIdListItem);
        return this;
    }

    public EnterpriseProjectCollectQueryResponseData withEpIdList(Consumer<List<String>> epIdListSetter) {
        if (this.epIdList == null) {
            this.epIdList = new ArrayList<>();
        }
        epIdListSetter.accept(this.epIdList);
        return this;
    }

    /**
     * **参数解释：** 企业项目收藏列表。 **取值范围：** 不涉及。
     * @return epIdList
     */
    public List<String> getEpIdList() {
        return epIdList;
    }

    public void setEpIdList(List<String> epIdList) {
        this.epIdList = epIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseProjectCollectQueryResponseData that = (EnterpriseProjectCollectQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.epIdList, that.epIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, epIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseProjectCollectQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    epIdList: ").append(toIndentedString(epIdList)).append("\n");
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
