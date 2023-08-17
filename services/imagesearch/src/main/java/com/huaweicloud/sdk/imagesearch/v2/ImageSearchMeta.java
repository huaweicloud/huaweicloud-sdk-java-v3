package com.huaweicloud.sdk.imagesearch.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.imagesearch.v2.model.AddDataParam;
import com.huaweicloud.sdk.imagesearch.v2.model.CheckParam;
import com.huaweicloud.sdk.imagesearch.v2.model.DeleteParam;
import com.huaweicloud.sdk.imagesearch.v2.model.RunAddDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunAddDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunCheckDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunCheckDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunDeleteDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunDeleteDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunSearchRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunSearchResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunUpdateDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunUpdateDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchParam;
import com.huaweicloud.sdk.imagesearch.v2.model.UpdateParam;

@SuppressWarnings("unchecked")
public class ImageSearchMeta {

    public static final HttpRequestDef<RunAddDataRequest, RunAddDataResponse> runAddData = genForrunAddData();

    private static HttpRequestDef<RunAddDataRequest, RunAddDataResponse> genForrunAddData() {
        // basic
        HttpRequestDef.Builder<RunAddDataRequest, RunAddDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAddDataRequest.class, RunAddDataResponse.class)
                .withName("RunAddData")
                .withUri("/v2/{project_id}/mms/{service_name}/data/add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAddDataRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<AddDataParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDataParam.class),
            f -> f.withMarshaller(RunAddDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCheckDataRequest, RunCheckDataResponse> runCheckData = genForrunCheckData();

    private static HttpRequestDef<RunCheckDataRequest, RunCheckDataResponse> genForrunCheckData() {
        // basic
        HttpRequestDef.Builder<RunCheckDataRequest, RunCheckDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunCheckDataRequest.class, RunCheckDataResponse.class)
                .withName("RunCheckData")
                .withUri("/v2/{project_id}/mms/{service_name}/data/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunCheckDataRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<CheckParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckParam.class),
            f -> f.withMarshaller(RunCheckDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDeleteDataRequest, RunDeleteDataResponse> runDeleteData =
        genForrunDeleteData();

    private static HttpRequestDef<RunDeleteDataRequest, RunDeleteDataResponse> genForrunDeleteData() {
        // basic
        HttpRequestDef.Builder<RunDeleteDataRequest, RunDeleteDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDeleteDataRequest.class, RunDeleteDataResponse.class)
                .withName("RunDeleteData")
                .withUri("/v2/{project_id}/mms/{service_name}/data/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunDeleteDataRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<DeleteParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteParam.class),
            f -> f.withMarshaller(RunDeleteDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSearchRequest, RunSearchResponse> runSearch = genForrunSearch();

    private static HttpRequestDef<RunSearchRequest, RunSearchResponse> genForrunSearch() {
        // basic
        HttpRequestDef.Builder<RunSearchRequest, RunSearchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSearchRequest.class, RunSearchResponse.class)
                .withName("RunSearch")
                .withUri("/v2/{project_id}/mms/{service_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSearchRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<SearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchParam.class),
            f -> f.withMarshaller(RunSearchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunUpdateDataRequest, RunUpdateDataResponse> runUpdateData =
        genForrunUpdateData();

    private static HttpRequestDef<RunUpdateDataRequest, RunUpdateDataResponse> genForrunUpdateData() {
        // basic
        HttpRequestDef.Builder<RunUpdateDataRequest, RunUpdateDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunUpdateDataRequest.class, RunUpdateDataResponse.class)
                .withName("RunUpdateData")
                .withUri("/v2/{project_id}/mms/{service_name}/data/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunUpdateDataRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<UpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateParam.class),
            f -> f.withMarshaller(RunUpdateDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
