package com.huaweicloud.sdk.mas.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mas.v1.model.NamespaceVo;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListRequest;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class MasMeta {

    public static final HttpRequestDef<ShowNameSpaceListRequest, ShowNameSpaceListResponse> showNameSpaceList =
        genForshowNameSpaceList();

    private static HttpRequestDef<ShowNameSpaceListRequest, ShowNameSpaceListResponse> genForshowNameSpaceList() {
        // basic
        HttpRequestDef.Builder<ShowNameSpaceListRequest, ShowNameSpaceListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNameSpaceListRequest.class, ShowNameSpaceListResponse.class)
                .withName("ShowNameSpaceList")
                .withUri("/v1/{project_id}/namespaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("is_used",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getIsUsed, (req, v) -> {
                req.setIsUsed(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameSpaceListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response
        builder.<List<NamespaceVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowNameSpaceListResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(NamespaceVo.class));

        return builder.build();
    }

}
