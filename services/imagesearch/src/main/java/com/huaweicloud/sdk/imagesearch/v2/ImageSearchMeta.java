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

    public static final HttpRequestDef<RunAddDataRequest, RunAddDataResponse> runAddData = genForRunAddData();

    private static HttpRequestDef<RunAddDataRequest, RunAddDataResponse> genForRunAddData() {
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
            f -> f.withMarshaller(RunAddDataRequest::getServiceName, RunAddDataRequest::setServiceName));
        builder.<AddDataParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDataParam.class),
            f -> f.withMarshaller(RunAddDataRequest::getBody, RunAddDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCheckDataRequest, RunCheckDataResponse> runCheckData = genForRunCheckData();

    private static HttpRequestDef<RunCheckDataRequest, RunCheckDataResponse> genForRunCheckData() {
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
            f -> f.withMarshaller(RunCheckDataRequest::getServiceName, RunCheckDataRequest::setServiceName));
        builder.<CheckParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckParam.class),
            f -> f.withMarshaller(RunCheckDataRequest::getBody, RunCheckDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDeleteDataRequest, RunDeleteDataResponse> runDeleteData =
        genForRunDeleteData();

    private static HttpRequestDef<RunDeleteDataRequest, RunDeleteDataResponse> genForRunDeleteData() {
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
            f -> f.withMarshaller(RunDeleteDataRequest::getServiceName, RunDeleteDataRequest::setServiceName));
        builder.<DeleteParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteParam.class),
            f -> f.withMarshaller(RunDeleteDataRequest::getBody, RunDeleteDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSearchRequest, RunSearchResponse> runSearch = genForRunSearch();

    private static HttpRequestDef<RunSearchRequest, RunSearchResponse> genForRunSearch() {
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
            f -> f.withMarshaller(RunSearchRequest::getServiceName, RunSearchRequest::setServiceName));
        builder.<SearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchParam.class),
            f -> f.withMarshaller(RunSearchRequest::getBody, RunSearchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunUpdateDataRequest, RunUpdateDataResponse> runUpdateData =
        genForRunUpdateData();

    private static HttpRequestDef<RunUpdateDataRequest, RunUpdateDataResponse> genForRunUpdateData() {
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
            f -> f.withMarshaller(RunUpdateDataRequest::getServiceName, RunUpdateDataRequest::setServiceName));
        builder.<UpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateParam.class),
            f -> f.withMarshaller(RunUpdateDataRequest::getBody, RunUpdateDataRequest::setBody));

        // response

        return builder.build();
    }

}
