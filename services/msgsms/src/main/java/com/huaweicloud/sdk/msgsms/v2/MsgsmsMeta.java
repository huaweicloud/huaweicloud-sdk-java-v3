package com.huaweicloud.sdk.msgsms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.msgsms.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.CreateSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.CreateTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.EnableSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.EnableSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListAppDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListAppDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListSendCountryDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListSendCountryDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListSignatureDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListSignatureDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateVarilableDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateVarilableDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppCountRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppCountResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureFileRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureFileResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.SmsAppAddReq;
import com.huaweicloud.sdk.msgsms.v2.model.SmsAppUpdateReq;
import com.huaweicloud.sdk.msgsms.v2.model.SmsCountryResp;
import com.huaweicloud.sdk.msgsms.v2.model.SmsSignatureReq;
import com.huaweicloud.sdk.msgsms.v2.model.SmsTemplateReq;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UploadSignatureFileRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UploadSignatureFileRequestBody;
import com.huaweicloud.sdk.msgsms.v2.model.UploadSignatureFileResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class MsgsmsMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v2/{project_id}/msgsms/apps")
                .withContentType("application/json");

        // requests
        builder.<SmsAppAddReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsAppAddReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppDetailsRequest, ListAppDetailsResponse> listAppDetails =
        genForListAppDetails();

    private static HttpRequestDef<ListAppDetailsRequest, ListAppDetailsResponse> genForListAppDetails() {
        // basic
        HttpRequestDef.Builder<ListAppDetailsRequest, ListAppDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppDetailsRequest.class, ListAppDetailsResponse.class)
                .withName("ListAppDetails")
                .withUri("/v2/{project_id}/msgsms/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getAppName, ListAppDetailsRequest::setAppName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getStartTime, ListAppDetailsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getEndTime, ListAppDetailsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getLimit, ListAppDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getOffset, ListAppDetailsRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getRegion, ListAppDetailsRequest::setRegion));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getSortDir, ListAppDetailsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getSortKey, ListAppDetailsRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppDetailsRequest::getStatus, ListAppDetailsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForShowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForShowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v2/{project_id}/msgsms/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getId, ShowAppRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppCountRequest, ShowAppCountResponse> showAppCount = genForShowAppCount();

    private static HttpRequestDef<ShowAppCountRequest, ShowAppCountResponse> genForShowAppCount() {
        // basic
        HttpRequestDef.Builder<ShowAppCountRequest, ShowAppCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppCountRequest.class, ShowAppCountResponse.class)
                .withName("ShowAppCount")
                .withUri("/v2/{project_id}/msgsms/apps-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppCountRequest::getRegion, ShowAppCountRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v2/{project_id}/msgsms/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getId, UpdateAppRequest::setId));
        builder.<SmsAppUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsAppUpdateReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureRequest, CreateSignatureResponse> createSignature =
        genForCreateSignature();

    private static HttpRequestDef<CreateSignatureRequest, CreateSignatureResponse> genForCreateSignature() {
        // basic
        HttpRequestDef.Builder<CreateSignatureRequest, CreateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSignatureRequest.class, CreateSignatureResponse.class)
                .withName("CreateSignature")
                .withUri("/v2/{project_id}/msgsms/signatures")
                .withContentType("application/json");

        // requests
        builder.<SmsSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsSignatureReq.class),
            f -> f.withMarshaller(CreateSignatureRequest::getBody, CreateSignatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureRequest, DeleteSignatureResponse> deleteSignature =
        genForDeleteSignature();

    private static HttpRequestDef<DeleteSignatureRequest, DeleteSignatureResponse> genForDeleteSignature() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureRequest, DeleteSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSignatureRequest.class, DeleteSignatureResponse.class)
                .withName("DeleteSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureRequest::getId, DeleteSignatureRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableSignatureRequest, EnableSignatureResponse> enableSignature =
        genForEnableSignature();

    private static HttpRequestDef<EnableSignatureRequest, EnableSignatureResponse> genForEnableSignature() {
        // basic
        HttpRequestDef.Builder<EnableSignatureRequest, EnableSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableSignatureRequest.class, EnableSignatureResponse.class)
                .withName("EnableSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}/active")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableSignatureRequest::getId, EnableSignatureRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureDetailsRequest, ListSignatureDetailsResponse> listSignatureDetails =
        genForListSignatureDetails();

    private static HttpRequestDef<ListSignatureDetailsRequest, ListSignatureDetailsResponse> genForListSignatureDetails() {
        // basic
        HttpRequestDef.Builder<ListSignatureDetailsRequest, ListSignatureDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSignatureDetailsRequest.class, ListSignatureDetailsResponse.class)
            .withName("ListSignatureDetails")
            .withUri("/v2/{project_id}/msgsms/signatures")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getAppName, ListSignatureDetailsRequest::setAppName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getStartTime,
                ListSignatureDetailsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getEndTime, ListSignatureDetailsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getLimit, ListSignatureDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getOffset, ListSignatureDetailsRequest::setOffset));
        builder.<String>withRequestField("signature_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureId,
                ListSignatureDetailsRequest::setSignatureId));
        builder.<String>withRequestField("signature_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureName,
                ListSignatureDetailsRequest::setSignatureName));
        builder.<String>withRequestField("signature_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSignatureType,
                ListSignatureDetailsRequest::setSignatureType));
        builder.<String>withRequestField("site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSite, ListSignatureDetailsRequest::setSite));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSortDir, ListSignatureDetailsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getSortKey, ListSignatureDetailsRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureDetailsRequest::getStatus, ListSignatureDetailsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignatureRequest, ShowSignatureResponse> showSignature =
        genForShowSignature();

    private static HttpRequestDef<ShowSignatureRequest, ShowSignatureResponse> genForShowSignature() {
        // basic
        HttpRequestDef.Builder<ShowSignatureRequest, ShowSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSignatureRequest.class, ShowSignatureResponse.class)
                .withName("ShowSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignatureRequest::getId, ShowSignatureRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignatureFileRequest, ShowSignatureFileResponse> showSignatureFile =
        genForShowSignatureFile();

    private static HttpRequestDef<ShowSignatureFileRequest, ShowSignatureFileResponse> genForShowSignatureFile() {
        // basic
        HttpRequestDef.Builder<ShowSignatureFileRequest, ShowSignatureFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSignatureFileRequest.class, ShowSignatureFileResponse.class)
                .withName("ShowSignatureFile")
                .withUri("/v2/{project_id}/msgsms/upload-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignatureFileRequest::getFileId, ShowSignatureFileRequest::setFileId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureRequest, UpdateSignatureResponse> updateSignature =
        genForUpdateSignature();

    private static HttpRequestDef<UpdateSignatureRequest, UpdateSignatureResponse> genForUpdateSignature() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureRequest, UpdateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSignatureRequest.class, UpdateSignatureResponse.class)
                .withName("UpdateSignature")
                .withUri("/v2/{project_id}/msgsms/signatures/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureRequest::getId, UpdateSignatureRequest::setId));
        builder.<SmsSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsSignatureReq.class),
            f -> f.withMarshaller(UpdateSignatureRequest::getBody, UpdateSignatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadSignatureFileRequest, UploadSignatureFileResponse> uploadSignatureFile =
        genForUploadSignatureFile();

    private static HttpRequestDef<UploadSignatureFileRequest, UploadSignatureFileResponse> genForUploadSignatureFile() {
        // basic
        HttpRequestDef.Builder<UploadSignatureFileRequest, UploadSignatureFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadSignatureFileRequest.class, UploadSignatureFileResponse.class)
                .withName("UploadSignatureFile")
                .withUri("/v2/{project_id}/msgsms/upload-files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("file_desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadSignatureFileRequest::getFileDesc, UploadSignatureFileRequest::setFileDesc));
        builder.<UploadSignatureFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadSignatureFileRequestBody.class),
            f -> f.withMarshaller(UploadSignatureFileRequest::getBody, UploadSignatureFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v2/{project_id}/msgsms/templates")
                .withContentType("application/json");

        // requests
        builder.<SmsTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getId, DeleteTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> listSendCountryDetails =
        genForListSendCountryDetails();

    private static HttpRequestDef<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> genForListSendCountryDetails() {
        // basic
        HttpRequestDef.Builder<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSendCountryDetailsRequest.class, ListSendCountryDetailsResponse.class)
            .withName("ListSendCountryDetails")
            .withUri("/v2/{project_id}/msgsms/country")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("country_name_en",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSendCountryDetailsRequest::getCountryNameEn,
                ListSendCountryDetailsRequest::setCountryNameEn));
        builder.<String>withRequestField("country_name_zh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSendCountryDetailsRequest::getCountryNameZh,
                ListSendCountryDetailsRequest::setCountryNameZh));

        // response
        builder.<List<SmsCountryResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSendCountryDetailsResponse::getBody, ListSendCountryDetailsResponse::setBody)
                .withInnerContainerType(SmsCountryResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateDetailsRequest, ListTemplateDetailsResponse> listTemplateDetails =
        genForListTemplateDetails();

    private static HttpRequestDef<ListTemplateDetailsRequest, ListTemplateDetailsResponse> genForListTemplateDetails() {
        // basic
        HttpRequestDef.Builder<ListTemplateDetailsRequest, ListTemplateDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateDetailsRequest.class, ListTemplateDetailsResponse.class)
                .withName("ListTemplateDetails")
                .withUri("/v2/{project_id}/msgsms/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getAppKey, ListTemplateDetailsRequest::setAppKey));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getAppName, ListTemplateDetailsRequest::setAppName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getStartTime, ListTemplateDetailsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getEndTime, ListTemplateDetailsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getLimit, ListTemplateDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getOffset, ListTemplateDetailsRequest::setOffset));
        builder.<String>withRequestField("flow_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getFlowStatus,
                ListTemplateDetailsRequest::setFlowStatus));
        builder.<String>withRequestField("has_variable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getHasVariable,
                ListTemplateDetailsRequest::setHasVariable));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getRegion, ListTemplateDetailsRequest::setRegion));
        builder.<String>withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSignName, ListTemplateDetailsRequest::setSignName));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSortDir, ListTemplateDetailsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getSortKey, ListTemplateDetailsRequest::setSortKey));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateId,
                ListTemplateDetailsRequest::setTemplateId));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateName,
                ListTemplateDetailsRequest::setTemplateName));
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDetailsRequest::getTemplateType,
                ListTemplateDetailsRequest::setTemplateType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> listTemplateVarilableDetails =
        genForListTemplateVarilableDetails();

    private static HttpRequestDef<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> genForListTemplateVarilableDetails() {
        // basic
        HttpRequestDef.Builder<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTemplateVarilableDetailsRequest.class,
                    ListTemplateVarilableDetailsResponse.class)
                .withName("ListTemplateVarilableDetails")
                .withUri("/v2/{project_id}/msgsms/templates/{id}/varilable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVarilableDetailsRequest::getId,
                ListTemplateVarilableDetailsRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForShowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForShowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getId, ShowTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForUpdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForUpdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v2/{project_id}/msgsms/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getId, UpdateTemplateRequest::setId));
        builder.<SmsTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsTemplateReq.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, UpdateTemplateRequest::setBody));

        // response

        return builder.build();
    }

}
