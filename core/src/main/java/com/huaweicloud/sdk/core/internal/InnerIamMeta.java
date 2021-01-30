package com.huaweicloud.sdk.core.internal;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.internal.model.KeystoneCreateProjectRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneCreateProjectRequestBody;
import com.huaweicloud.sdk.core.internal.model.KeystoneCreateProjectResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListRegionsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListRegionsResponse;

public class InnerIamMeta {
    public static final HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> KEYSTONE_LIST_PROJECTS
        = genForKeystoneListProjects();

    private static HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse>
        genForKeystoneListProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectsRequest, KeystoneListProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListProjectsRequest.class, KeystoneListProjectsResponse.class)
            .withUri("/v3/projects")
            .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getDomainId, KeystoneListProjectsRequest::setDomainId)
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getName, KeystoneListProjectsRequest::setName)
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getParentId, KeystoneListProjectsRequest::setParentId)
        );
        builder.withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getEnabled, KeystoneListProjectsRequest::setEnabled)
        );
        builder.withRequestField("is_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getIsDomain, KeystoneListProjectsRequest::setIsDomain)
        );

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>
        KEYSTONE_CREATE_PROJECT = genForKeystoneCreateProject();

    private static HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>
        genForKeystoneCreateProject() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, KeystoneCreateProjectRequest.class, KeystoneCreateProjectResponse.class)
            .withUri("/v3/projects")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateProjectRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateProjectRequest::getBody, KeystoneCreateProjectRequest::setBody)
        );

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> KEYSTONE_LIST_REGIONS
        = genForKeystoneListRegions();

    private static HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> genForKeystoneListRegions() {
        // basic
        HttpRequestDef.Builder<KeystoneListRegionsRequest, KeystoneListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListRegionsRequest.class, KeystoneListRegionsResponse.class)
                .withUri("/v3/regions")
                .withContentType("application/json");

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>
        KEYSTONE_LIST_AUTH_DOMAINS = genForKeystoneListAuthDomains();

    private static HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>
        genForKeystoneListAuthDomains() {
        // basic
        HttpRequestDef.Builder<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListAuthDomainsRequest.class, KeystoneListAuthDomainsResponse.class)
            .withUri("/v3/auth/domains")
            .withContentType("application/json");

        return builder.build();
    }

}
