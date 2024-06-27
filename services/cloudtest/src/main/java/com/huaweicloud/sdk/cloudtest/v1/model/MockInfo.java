package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MockInfo
 */
public class MockInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_id")

    private String mockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_switch")

    private Boolean mockSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_url")

    private String mockUrl;

    public MockInfo withMockId(String mockId) {
        this.mockId = mockId;
        return this;
    }

    /**
     * mock id
     * @return mockId
     */
    public String getMockId() {
        return mockId;
    }

    public void setMockId(String mockId) {
        this.mockId = mockId;
    }

    public MockInfo withMockSwitch(Boolean mockSwitch) {
        this.mockSwitch = mockSwitch;
        return this;
    }

    /**
     * mock开关
     * @return mockSwitch
     */
    public Boolean getMockSwitch() {
        return mockSwitch;
    }

    public void setMockSwitch(Boolean mockSwitch) {
        this.mockSwitch = mockSwitch;
    }

    public MockInfo withMockUrl(String mockUrl) {
        this.mockUrl = mockUrl;
        return this;
    }

    /**
     * mock url
     * @return mockUrl
     */
    public String getMockUrl() {
        return mockUrl;
    }

    public void setMockUrl(String mockUrl) {
        this.mockUrl = mockUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MockInfo that = (MockInfo) obj;
        return Objects.equals(this.mockId, that.mockId) && Objects.equals(this.mockSwitch, that.mockSwitch)
            && Objects.equals(this.mockUrl, that.mockUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mockId, mockSwitch, mockUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MockInfo {\n");
        sb.append("    mockId: ").append(toIndentedString(mockId)).append("\n");
        sb.append("    mockSwitch: ").append(toIndentedString(mockSwitch)).append("\n");
        sb.append("    mockUrl: ").append(toIndentedString(mockUrl)).append("\n");
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
