package com.huaweicloud.sdk.geip.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.geip.v3.model.AddGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AddGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AddInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AssociateGeipSegmentInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.AssociateGeipSegmentInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceGlobalEipSegmentRequestBody;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.AttachInternetBandwidthGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.AttachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.AttachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachGeipSegmentInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachGeipSegmentInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthsGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthsGlobalEipSegmentRequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthRequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateV2RequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteV2RequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachGeipSegmentInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachGeipSegmentInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthsGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipsRequest;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipsResponse;
import com.huaweicloud.sdk.geip.v3.model.CountInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.CountInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipSegmentRequestBody;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateInternetBandwidthRequestBody;
import com.huaweicloud.sdk.geip.v3.model.CreateInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateV2TagRequestBody;
import com.huaweicloud.sdk.geip.v3.model.DeleteGeipSegmentTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGeipSegmentTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.DetachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.DetachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.DisassociateGeipSegmentInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.DisassociateGeipSegmentInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.DisassociateInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.DisassociateInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.ListAccessSitesRequest;
import com.huaweicloud.sdk.geip.v3.model.ListAccessSitesResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipPoolsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipPoolsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipResourceQuotasRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipResourceQuotasResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipSegmentsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipSegmentsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthLimitsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthLimitsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListResourcesByTagsRequestBody;
import com.huaweicloud.sdk.geip.v3.model.ListSupportMasksRequest;
import com.huaweicloud.sdk.geip.v3.model.ListSupportMasksResponse;
import com.huaweicloud.sdk.geip.v3.model.ListSupportRegionsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListSupportRegionsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListTenantGeipSupportInstancesRequest;
import com.huaweicloud.sdk.geip.v3.model.ListTenantGeipSupportInstancesResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowJobsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowJobsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipRequestBody;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipSegmentRequestBody;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateInternetBandwidthRequestBody;
import com.huaweicloud.sdk.geip.v3.model.UpdateInternetBandwidthResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class GeipMeta {

    public static final HttpRequestDef<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse> addInternetBandwidthTags =
        genForAddInternetBandwidthTags();

    private static HttpRequestDef<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse> genForAddInternetBandwidthTags() {
        // basic
        HttpRequestDef.Builder<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddInternetBandwidthTagsRequest.class, AddInternetBandwidthTagsResponse.class)
                .withName("AddInternetBandwidthTags")
                .withUri("/v3/internet-bandwidth/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddInternetBandwidthTagsRequest::getResourceId,
                AddInternetBandwidthTagsRequest::setResourceId));
        builder.<CreateV2TagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2TagRequestBody.class),
            f -> f.withMarshaller(AddInternetBandwidthTagsRequest::getBody, AddInternetBandwidthTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddInternetBandwidthTagsResponse::getXRequestId,
                AddInternetBandwidthTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse> batchCreateInternetBandwidth =
        genForBatchCreateInternetBandwidth();

    private static HttpRequestDef<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse> genForBatchCreateInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateInternetBandwidthRequest.class,
                    BatchCreateInternetBandwidthResponse.class)
                .withName("BatchCreateInternetBandwidth")
                .withUri("/v3/{domain_id}/geip/internet-bandwidths/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateInternetBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateInternetBandwidthRequestBody.class),
            f -> f.withMarshaller(BatchCreateInternetBandwidthRequest::getBody,
                BatchCreateInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateInternetBandwidthResponse::getXRequestId,
                BatchCreateInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse> batchCreateInternetBandwidthTags =
        genForBatchCreateInternetBandwidthTags();

    private static HttpRequestDef<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse> genForBatchCreateInternetBandwidthTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateInternetBandwidthTagsRequest.class,
                    BatchCreateInternetBandwidthTagsResponse.class)
                .withName("BatchCreateInternetBandwidthTags")
                .withUri("/v3/internet-bandwidth/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateInternetBandwidthTagsRequest::getResourceId,
                BatchCreateInternetBandwidthTagsRequest::setResourceId));
        builder.<BatchCreateV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateV2RequestBody.class),
            f -> f.withMarshaller(BatchCreateInternetBandwidthTagsRequest::getBody,
                BatchCreateInternetBandwidthTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateInternetBandwidthTagsResponse::getXRequestId,
                BatchCreateInternetBandwidthTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse> batchDeleteInternetBandwidthTags =
        genForBatchDeleteInternetBandwidthTags();

    private static HttpRequestDef<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse> genForBatchDeleteInternetBandwidthTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteInternetBandwidthTagsRequest.class,
                    BatchDeleteInternetBandwidthTagsResponse.class)
                .withName("BatchDeleteInternetBandwidthTags")
                .withUri("/v3/internet-bandwidth/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInternetBandwidthTagsRequest::getResourceId,
                BatchDeleteInternetBandwidthTagsRequest::setResourceId));
        builder.<BatchDeleteV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteV2RequestBody.class),
            f -> f.withMarshaller(BatchDeleteInternetBandwidthTagsRequest::getBody,
                BatchDeleteInternetBandwidthTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteInternetBandwidthTagsResponse::getXRequestId,
                BatchDeleteInternetBandwidthTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CountInternetBandwidthRequest, CountInternetBandwidthResponse> countInternetBandwidth =
        genForCountInternetBandwidth();

    private static HttpRequestDef<CountInternetBandwidthRequest, CountInternetBandwidthResponse> genForCountInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<CountInternetBandwidthRequest, CountInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CountInternetBandwidthRequest.class, CountInternetBandwidthResponse.class)
            .withName("CountInternetBandwidth")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths/count")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getId, CountInternetBandwidthRequest::setId));
        builder.<List<Integer>>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getSize, CountInternetBandwidthRequest::setSize));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getName, CountInternetBandwidthRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getNameLike,
                CountInternetBandwidthRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getAccessSite,
                CountInternetBandwidthRequest::setAccessSite));
        builder.<List<CountInternetBandwidthRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getStatus, CountInternetBandwidthRequest::setStatus));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getEnterpriseProjectId,
                CountInternetBandwidthRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountInternetBandwidthRequest::getTags, CountInternetBandwidthRequest::setTags));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountInternetBandwidthResponse::getXRequestId,
                CountInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse> createInternetBandwidth =
        genForCreateInternetBandwidth();

    private static HttpRequestDef<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse> genForCreateInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInternetBandwidthRequest.class, CreateInternetBandwidthResponse.class)
            .withName("CreateInternetBandwidth")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths")
            .withContentType("application/json");

        // requests
        builder.<CreateInternetBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInternetBandwidthRequestBody.class),
            f -> f.withMarshaller(CreateInternetBandwidthRequest::getBody, CreateInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateInternetBandwidthResponse::getXRequestId,
                CreateInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse> createUserDisclaimer =
        genForCreateUserDisclaimer();

    private static HttpRequestDef<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse> genForCreateUserDisclaimer() {
        // basic
        HttpRequestDef.Builder<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateUserDisclaimerRequest.class, CreateUserDisclaimerResponse.class)
            .withName("CreateUserDisclaimer")
            .withUri("/v3/{domain_id}/geip/user-disclaimer-records")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateUserDisclaimerResponse::getXRequestId,
                CreateUserDisclaimerResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse> deleteInternetBandwidth =
        genForDeleteInternetBandwidth();

    private static HttpRequestDef<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse> genForDeleteInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInternetBandwidthRequest.class, DeleteInternetBandwidthResponse.class)
            .withName("DeleteInternetBandwidth")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths/{internet_bandwidth_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("internet_bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInternetBandwidthRequest::getInternetBandwidthId,
                DeleteInternetBandwidthRequest::setInternetBandwidthId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteInternetBandwidthResponse::getXRequestId,
                DeleteInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse> deleteInternetBandwidthTag =
        genForDeleteInternetBandwidthTag();

    private static HttpRequestDef<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse> genForDeleteInternetBandwidthTag() {
        // basic
        HttpRequestDef.Builder<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInternetBandwidthTagRequest.class,
                    DeleteInternetBandwidthTagResponse.class)
                .withName("DeleteInternetBandwidthTag")
                .withUri("/v3/internet-bandwidth/{resource_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInternetBandwidthTagRequest::getResourceId,
                DeleteInternetBandwidthTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInternetBandwidthTagRequest::getTagKey,
                DeleteInternetBandwidthTagRequest::setTagKey));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteInternetBandwidthTagResponse::getXRequestId,
                DeleteInternetBandwidthTagResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse> deleteUserDisclaimer =
        genForDeleteUserDisclaimer();

    private static HttpRequestDef<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse> genForDeleteUserDisclaimer() {
        // basic
        HttpRequestDef.Builder<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteUserDisclaimerRequest.class, DeleteUserDisclaimerResponse.class)
            .withName("DeleteUserDisclaimer")
            .withUri("/v3/{domain_id}/geip/user-disclaimer-records")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteUserDisclaimerResponse::getXRequestId,
                DeleteUserDisclaimerResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAccessSitesRequest, ListAccessSitesResponse> listAccessSites =
        genForListAccessSites();

    private static HttpRequestDef<ListAccessSitesRequest, ListAccessSitesResponse> genForListAccessSites() {
        // basic
        HttpRequestDef.Builder<ListAccessSitesRequest, ListAccessSitesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessSitesRequest.class, ListAccessSitesResponse.class)
                .withName("ListAccessSites")
                .withUri("/v3/{domain_id}/geip/access-sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getLimit, ListAccessSitesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getOffset, ListAccessSitesRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getMarker, ListAccessSitesRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getPageReverse, ListAccessSitesRequest::setPageReverse));
        builder.<List<ListAccessSitesRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getFields, ListAccessSitesRequest::setFields));
        builder.<List<ListAccessSitesRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getSortKey, ListAccessSitesRequest::setSortKey));
        builder.<List<ListAccessSitesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getSortDir, ListAccessSitesRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getId, ListAccessSitesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getCode, ListAccessSitesRequest::setCode));
        builder.<List<String>>withRequestField("proxy_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getProxyRegion, ListAccessSitesRequest::setProxyRegion));
        builder.<List<String>>withRequestField("iec_az_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessSitesRequest::getIecAzCode, ListAccessSitesRequest::setIecAzCode));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAccessSitesResponse::getXRequestId, ListAccessSitesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse> listGeipResourceQuotas =
        genForListGeipResourceQuotas();

    private static HttpRequestDef<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse> genForListGeipResourceQuotas() {
        // basic
        HttpRequestDef.Builder<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGeipResourceQuotasRequest.class, ListGeipResourceQuotasResponse.class)
            .withName("ListGeipResourceQuotas")
            .withUri("/v3/{domain_id}/geip/quotas")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getLimit, ListGeipResourceQuotasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getOffset, ListGeipResourceQuotasRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getMarker, ListGeipResourceQuotasRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getPageReverse,
                ListGeipResourceQuotasRequest::setPageReverse));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getFields, ListGeipResourceQuotasRequest::setFields));
        builder.<List<ListGeipResourceQuotasRequest.TypeEnum>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipResourceQuotasRequest::getType, ListGeipResourceQuotasRequest::setType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeipResourceQuotasResponse::getXRequestId,
                ListGeipResourceQuotasResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse> listInternetBandwidthCountFilterTags =
        genForListInternetBandwidthCountFilterTags();

    private static HttpRequestDef<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse> genForListInternetBandwidthCountFilterTags() {
        // basic
        HttpRequestDef.Builder<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInternetBandwidthCountFilterTagsRequest.class,
                    ListInternetBandwidthCountFilterTagsResponse.class)
                .withName("ListInternetBandwidthCountFilterTags")
                .withUri("/v3/internet-bandwidth/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInternetBandwidthCountFilterTagsRequest::getBody,
                ListInternetBandwidthCountFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInternetBandwidthCountFilterTagsResponse::getXRequestId,
                ListInternetBandwidthCountFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse> listInternetBandwidthDomainTags =
        genForListInternetBandwidthDomainTags();

    private static HttpRequestDef<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse> genForListInternetBandwidthDomainTags() {
        // basic
        HttpRequestDef.Builder<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInternetBandwidthDomainTagsRequest.class,
                    ListInternetBandwidthDomainTagsResponse.class)
                .withName("ListInternetBandwidthDomainTags")
                .withUri("/v3/internet-bandwidth/tags")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInternetBandwidthDomainTagsResponse::getXRequestId,
                ListInternetBandwidthDomainTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse> listInternetBandwidthFilterTags =
        genForListInternetBandwidthFilterTags();

    private static HttpRequestDef<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse> genForListInternetBandwidthFilterTags() {
        // basic
        HttpRequestDef.Builder<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInternetBandwidthFilterTagsRequest.class,
                    ListInternetBandwidthFilterTagsResponse.class)
                .withName("ListInternetBandwidthFilterTags")
                .withUri("/v3/internet-bandwidth/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<List<Integer>>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthFilterTagsRequest::getLimit,
                ListInternetBandwidthFilterTagsRequest::setLimit));
        builder.<List<Integer>>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthFilterTagsRequest::getOffset,
                ListInternetBandwidthFilterTagsRequest::setOffset));
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInternetBandwidthFilterTagsRequest::getBody,
                ListInternetBandwidthFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInternetBandwidthFilterTagsResponse::getXRequestId,
                ListInternetBandwidthFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse> listInternetBandwidthLimits =
        genForListInternetBandwidthLimits();

    private static HttpRequestDef<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse> genForListInternetBandwidthLimits() {
        // basic
        HttpRequestDef.Builder<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInternetBandwidthLimitsRequest.class,
                    ListInternetBandwidthLimitsResponse.class)
                .withName("ListInternetBandwidthLimits")
                .withUri("/v3/{domain_id}/geip/internet-bandwidth-limits")
                .withContentType("application/json");

        // requests
        builder.<List<ListInternetBandwidthLimitsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthLimitsRequest::getFields,
                ListInternetBandwidthLimitsRequest::setFields));
        builder.<List<ListInternetBandwidthLimitsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthLimitsRequest::getSortKey,
                ListInternetBandwidthLimitsRequest::setSortKey));
        builder.<List<ListInternetBandwidthLimitsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthLimitsRequest::getSortDir,
                ListInternetBandwidthLimitsRequest::setSortDir));
        builder.<List<ListInternetBandwidthLimitsRequest.ChargeModeEnum>>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthLimitsRequest::getChargeMode,
                ListInternetBandwidthLimitsRequest::setChargeMode));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetBandwidthLimitsRequest::getType,
                ListInternetBandwidthLimitsRequest::setType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInternetBandwidthLimitsResponse::getXRequestId,
                ListInternetBandwidthLimitsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse> listInternetBandwidths =
        genForListInternetBandwidths();

    private static HttpRequestDef<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse> genForListInternetBandwidths() {
        // basic
        HttpRequestDef.Builder<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInternetBandwidthsRequest.class, ListInternetBandwidthsResponse.class)
            .withName("ListInternetBandwidths")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getLimit, ListInternetBandwidthsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getOffset, ListInternetBandwidthsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getMarker, ListInternetBandwidthsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getPageReverse,
                ListInternetBandwidthsRequest::setPageReverse));
        builder.<List<ListInternetBandwidthsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getFields, ListInternetBandwidthsRequest::setFields));
        builder.<List<ListInternetBandwidthsRequest.ExtFieldsEnum>>withRequestField("ext-fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getExtFields,
                ListInternetBandwidthsRequest::setExtFields));
        builder.<List<ListInternetBandwidthsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getSortKey,
                ListInternetBandwidthsRequest::setSortKey));
        builder.<List<ListInternetBandwidthsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getSortDir,
                ListInternetBandwidthsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getId, ListInternetBandwidthsRequest::setId));
        builder.<List<Integer>>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getSize, ListInternetBandwidthsRequest::setSize));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getName, ListInternetBandwidthsRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getNameLike,
                ListInternetBandwidthsRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getAccessSite,
                ListInternetBandwidthsRequest::setAccessSite));
        builder.<List<ListInternetBandwidthsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getStatus, ListInternetBandwidthsRequest::setStatus));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getEnterpriseProjectId,
                ListInternetBandwidthsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getTags, ListInternetBandwidthsRequest::setTags));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInternetBandwidthsRequest::getType, ListInternetBandwidthsRequest::setType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInternetBandwidthsResponse::getXRequestId,
                ListInternetBandwidthsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSupportMasksRequest, ListSupportMasksResponse> listSupportMasks =
        genForListSupportMasks();

    private static HttpRequestDef<ListSupportMasksRequest, ListSupportMasksResponse> genForListSupportMasks() {
        // basic
        HttpRequestDef.Builder<ListSupportMasksRequest, ListSupportMasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupportMasksRequest.class, ListSupportMasksResponse.class)
                .withName("ListSupportMasks")
                .withUri("/v3/{domain_id}/global-eip-segments/support-masks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getLimit, ListSupportMasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getOffset, ListSupportMasksRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getMarker, ListSupportMasksRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getPageReverse, ListSupportMasksRequest::setPageReverse));
        builder.<List<ListSupportMasksRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getFields, ListSupportMasksRequest::setFields));
        builder.<List<ListSupportMasksRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getSortKey, ListSupportMasksRequest::setSortKey));
        builder.<List<ListSupportMasksRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getSortDir, ListSupportMasksRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getId, ListSupportMasksRequest::setId));
        builder.<List<ListSupportMasksRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getIpVersion, ListSupportMasksRequest::setIpVersion));
        builder.<List<Integer>>withRequestField("mask",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportMasksRequest::getMask, ListSupportMasksRequest::setMask));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSupportMasksResponse::getXRequestId, ListSupportMasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse> showInternetBandwidth =
        genForShowInternetBandwidth();

    private static HttpRequestDef<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse> genForShowInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInternetBandwidthRequest.class, ShowInternetBandwidthResponse.class)
            .withName("ShowInternetBandwidth")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths/{internet_bandwidth_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("internet_bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInternetBandwidthRequest::getInternetBandwidthId,
                ShowInternetBandwidthRequest::setInternetBandwidthId));
        builder.<List<ShowInternetBandwidthRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowInternetBandwidthRequest::getFields, ShowInternetBandwidthRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInternetBandwidthResponse::getXRequestId,
                ShowInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse> showInternetBandwidthTags =
        genForShowInternetBandwidthTags();

    private static HttpRequestDef<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse> genForShowInternetBandwidthTags() {
        // basic
        HttpRequestDef.Builder<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInternetBandwidthTagsRequest.class,
                    ShowInternetBandwidthTagsResponse.class)
                .withName("ShowInternetBandwidthTags")
                .withUri("/v3/internet-bandwidth/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInternetBandwidthTagsRequest::getResourceId,
                ShowInternetBandwidthTagsRequest::setResourceId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInternetBandwidthTagsResponse::getXRequestId,
                ShowInternetBandwidthTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse> showUserDisclaimer =
        genForShowUserDisclaimer();

    private static HttpRequestDef<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse> genForShowUserDisclaimer() {
        // basic
        HttpRequestDef.Builder<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserDisclaimerRequest.class, ShowUserDisclaimerResponse.class)
                .withName("ShowUserDisclaimer")
                .withUri("/v3/{domain_id}/geip/user-disclaimer-records")
                .withContentType("application/json");

        // requests
        builder.<List<ShowUserDisclaimerRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowUserDisclaimerRequest::getFields, ShowUserDisclaimerRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUserDisclaimerResponse::getXRequestId,
                ShowUserDisclaimerResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse> updateInternetBandwidth =
        genForUpdateInternetBandwidth();

    private static HttpRequestDef<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse> genForUpdateInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInternetBandwidthRequest.class, UpdateInternetBandwidthResponse.class)
            .withName("UpdateInternetBandwidth")
            .withUri("/v3/{domain_id}/geip/internet-bandwidths/{internet_bandwidth_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("internet_bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInternetBandwidthRequest::getInternetBandwidthId,
                UpdateInternetBandwidthRequest::setInternetBandwidthId));
        builder.<UpdateInternetBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInternetBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateInternetBandwidthRequest::getBody, UpdateInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateInternetBandwidthResponse::getXRequestId,
                UpdateInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse> addGeipSegmentTags =
        genForAddGeipSegmentTags();

    private static HttpRequestDef<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse> genForAddGeipSegmentTags() {
        // basic
        HttpRequestDef.Builder<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddGeipSegmentTagsRequest.class, AddGeipSegmentTagsResponse.class)
                .withName("AddGeipSegmentTags")
                .withUri("/v3/global-eip-segment/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddGeipSegmentTagsRequest::getResourceId, AddGeipSegmentTagsRequest::setResourceId));
        builder.<CreateV2TagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2TagRequestBody.class),
            f -> f.withMarshaller(AddGeipSegmentTagsRequest::getBody, AddGeipSegmentTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddGeipSegmentTagsResponse::getXRequestId,
                AddGeipSegmentTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse> addGlobalEipTags =
        genForAddGlobalEipTags();

    private static HttpRequestDef<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse> genForAddGlobalEipTags() {
        // basic
        HttpRequestDef.Builder<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddGlobalEipTagsRequest.class, AddGlobalEipTagsResponse.class)
                .withName("AddGlobalEipTags")
                .withUri("/v3/global-eip/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddGlobalEipTagsRequest::getResourceId, AddGlobalEipTagsRequest::setResourceId));
        builder.<CreateV2TagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateV2TagRequestBody.class),
            f -> f.withMarshaller(AddGlobalEipTagsRequest::getBody, AddGlobalEipTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddGlobalEipTagsResponse::getXRequestId, AddGlobalEipTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse> associateGeipSegmentInstance =
        genForAssociateGeipSegmentInstance();

    private static HttpRequestDef<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse> genForAssociateGeipSegmentInstance() {
        // basic
        HttpRequestDef.Builder<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateGeipSegmentInstanceRequest.class,
                    AssociateGeipSegmentInstanceResponse.class)
                .withName("AssociateGeipSegmentInstance")
                .withUri("/v3/{domain_id}/global-eip-segments/{global_eip_segment_id}/associate-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGeipSegmentInstanceRequest::getGlobalEipSegmentId,
                AssociateGeipSegmentInstanceRequest::setGlobalEipSegmentId));
        builder.<AssociateInstanceGlobalEipSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateInstanceGlobalEipSegmentRequestBody.class),
            f -> f.withMarshaller(AssociateGeipSegmentInstanceRequest::getBody,
                AssociateGeipSegmentInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateGeipSegmentInstanceResponse::getXRequestId,
                AssociateGeipSegmentInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AssociateInstanceRequest, AssociateInstanceResponse> associateInstance =
        genForAssociateInstance();

    private static HttpRequestDef<AssociateInstanceRequest, AssociateInstanceResponse> genForAssociateInstance() {
        // basic
        HttpRequestDef.Builder<AssociateInstanceRequest, AssociateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateInstanceRequest.class, AssociateInstanceResponse.class)
                .withName("AssociateInstance")
                .withUri("/v3/{domain_id}/global-eips/{global_eip_id}/associate-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateInstanceRequest::getGlobalEipId, AssociateInstanceRequest::setGlobalEipId));
        builder.<String>withRequestField("binding-instance-service",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateInstanceRequest::getBindingInstanceService,
                AssociateInstanceRequest::setBindingInstanceService));
        builder.<AssociateInstanceGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateInstanceGlobalEipRequestBody.class),
            f -> f.withMarshaller(AssociateInstanceRequest::getBody, AssociateInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateInstanceResponse::getXRequestId, AssociateInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse> attachInternetBandwidth =
        genForAttachInternetBandwidth();

    private static HttpRequestDef<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse> genForAttachInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachInternetBandwidthRequest.class, AttachInternetBandwidthResponse.class)
            .withName("AttachInternetBandwidth")
            .withUri("/v3/{domain_id}/global-eips/{global_eip_id}/attach-internet-bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachInternetBandwidthRequest::getGlobalEipId,
                AttachInternetBandwidthRequest::setGlobalEipId));
        builder.<AttachInternetBandwidthGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachInternetBandwidthGlobalEipRequestBody.class),
            f -> f.withMarshaller(AttachInternetBandwidthRequest::getBody, AttachInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AttachInternetBandwidthResponse::getXRequestId,
                AttachInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse> batchAttachGeipSegmentInternetBandwidth =
        genForBatchAttachGeipSegmentInternetBandwidth();

    private static HttpRequestDef<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse> genForBatchAttachGeipSegmentInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAttachGeipSegmentInternetBandwidthRequest.class,
                    BatchAttachGeipSegmentInternetBandwidthResponse.class)
                .withName("BatchAttachGeipSegmentInternetBandwidth")
                .withUri("/v3/{domain_id}/global-eip-segments/batch-attach-internet-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<BatchAttachInternetBandwidthsGlobalEipSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachInternetBandwidthsGlobalEipSegmentRequestBody.class),
            f -> f.withMarshaller(BatchAttachGeipSegmentInternetBandwidthRequest::getBody,
                BatchAttachGeipSegmentInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAttachGeipSegmentInternetBandwidthResponse::getXRequestId,
                BatchAttachGeipSegmentInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse> batchAttachInternetBandwidth =
        genForBatchAttachInternetBandwidth();

    private static HttpRequestDef<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse> genForBatchAttachInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAttachInternetBandwidthRequest.class,
                    BatchAttachInternetBandwidthResponse.class)
                .withName("BatchAttachInternetBandwidth")
                .withUri("/v3/{domain_id}/global-eips/batch-attach-internet-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<BatchAttachInternetBandwidthsGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachInternetBandwidthsGlobalEipRequestBody.class),
            f -> f.withMarshaller(BatchAttachInternetBandwidthRequest::getBody,
                BatchAttachInternetBandwidthRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAttachInternetBandwidthResponse::getBody,
                BatchAttachInternetBandwidthResponse::setBody));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAttachInternetBandwidthResponse::getXRequestId,
                BatchAttachInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse> batchCreateGeipSegmentTags =
        genForBatchCreateGeipSegmentTags();

    private static HttpRequestDef<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse> genForBatchCreateGeipSegmentTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateGeipSegmentTagsRequest.class,
                    BatchCreateGeipSegmentTagsResponse.class)
                .withName("BatchCreateGeipSegmentTags")
                .withUri("/v3/global-eip-segment/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateGeipSegmentTagsRequest::getResourceId,
                BatchCreateGeipSegmentTagsRequest::setResourceId));
        builder.<BatchCreateV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateV2RequestBody.class),
            f -> f.withMarshaller(BatchCreateGeipSegmentTagsRequest::getBody,
                BatchCreateGeipSegmentTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateGeipSegmentTagsResponse::getXRequestId,
                BatchCreateGeipSegmentTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse> batchCreateGlobalEip =
        genForBatchCreateGlobalEip();

    private static HttpRequestDef<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse> genForBatchCreateGlobalEip() {
        // basic
        HttpRequestDef.Builder<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateGlobalEipRequest.class, BatchCreateGlobalEipResponse.class)
            .withName("BatchCreateGlobalEip")
            .withUri("/v3/{domain_id}/global-eips/batch-create")
            .withContentType("application/json");

        // requests
        builder.<BatchCreateGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateGlobalEipRequestBody.class),
            f -> f.withMarshaller(BatchCreateGlobalEipRequest::getBody, BatchCreateGlobalEipRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateGlobalEipResponse::getXRequestId,
                BatchCreateGlobalEipResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse> batchCreateGlobalEipTags =
        genForBatchCreateGlobalEipTags();

    private static HttpRequestDef<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse> genForBatchCreateGlobalEipTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchCreateGlobalEipTagsRequest.class, BatchCreateGlobalEipTagsResponse.class)
                .withName("BatchCreateGlobalEipTags")
                .withUri("/v3/global-eip/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateGlobalEipTagsRequest::getResourceId,
                BatchCreateGlobalEipTagsRequest::setResourceId));
        builder.<BatchCreateV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateV2RequestBody.class),
            f -> f.withMarshaller(BatchCreateGlobalEipTagsRequest::getBody, BatchCreateGlobalEipTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateGlobalEipTagsResponse::getXRequestId,
                BatchCreateGlobalEipTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse> batchDeleteGeipSegmentTags =
        genForBatchDeleteGeipSegmentTags();

    private static HttpRequestDef<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse> genForBatchDeleteGeipSegmentTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteGeipSegmentTagsRequest.class,
                    BatchDeleteGeipSegmentTagsResponse.class)
                .withName("BatchDeleteGeipSegmentTags")
                .withUri("/v3/global-eip-segment/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteGeipSegmentTagsRequest::getResourceId,
                BatchDeleteGeipSegmentTagsRequest::setResourceId));
        builder.<BatchDeleteV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteV2RequestBody.class),
            f -> f.withMarshaller(BatchDeleteGeipSegmentTagsRequest::getBody,
                BatchDeleteGeipSegmentTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteGeipSegmentTagsResponse::getXRequestId,
                BatchDeleteGeipSegmentTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse> batchDeleteGlobalEipTags =
        genForBatchDeleteGlobalEipTags();

    private static HttpRequestDef<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse> genForBatchDeleteGlobalEipTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteGlobalEipTagsRequest.class, BatchDeleteGlobalEipTagsResponse.class)
                .withName("BatchDeleteGlobalEipTags")
                .withUri("/v3/global-eip/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteGlobalEipTagsRequest::getResourceId,
                BatchDeleteGlobalEipTagsRequest::setResourceId));
        builder.<BatchDeleteV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteV2RequestBody.class),
            f -> f.withMarshaller(BatchDeleteGlobalEipTagsRequest::getBody, BatchDeleteGlobalEipTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteGlobalEipTagsResponse::getXRequestId,
                BatchDeleteGlobalEipTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse> batchDetachGeipSegmentInternetBandwidth =
        genForBatchDetachGeipSegmentInternetBandwidth();

    private static HttpRequestDef<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse> genForBatchDetachGeipSegmentInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDetachGeipSegmentInternetBandwidthRequest.class,
                    BatchDetachGeipSegmentInternetBandwidthResponse.class)
                .withName("BatchDetachGeipSegmentInternetBandwidth")
                .withUri("/v3/{domain_id}/global-eip-segments/batch-detach-internet-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody.class),
            f -> f.withMarshaller(BatchDetachGeipSegmentInternetBandwidthRequest::getBody,
                BatchDetachGeipSegmentInternetBandwidthRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDetachGeipSegmentInternetBandwidthResponse::getXRequestId,
                BatchDetachGeipSegmentInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse> batchDetachInternetBandwidth =
        genForBatchDetachInternetBandwidth();

    private static HttpRequestDef<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse> genForBatchDetachInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDetachInternetBandwidthRequest.class,
                    BatchDetachInternetBandwidthResponse.class)
                .withName("BatchDetachInternetBandwidth")
                .withUri("/v3/{domain_id}/global-eips/batch-detach-internet-bandwidths")
                .withContentType("application/json");

        // requests
        builder.<BatchDetachInternetBandwidthsGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDetachInternetBandwidthsGlobalEipRequestBody.class),
            f -> f.withMarshaller(BatchDetachInternetBandwidthRequest::getBody,
                BatchDetachInternetBandwidthRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDetachInternetBandwidthResponse::getBody,
                BatchDetachInternetBandwidthResponse::setBody));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDetachInternetBandwidthResponse::getXRequestId,
                BatchDetachInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse> countGlobalEipSegment =
        genForCountGlobalEipSegment();

    private static HttpRequestDef<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse> genForCountGlobalEipSegment() {
        // basic
        HttpRequestDef.Builder<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CountGlobalEipSegmentRequest.class, CountGlobalEipSegmentResponse.class)
            .withName("CountGlobalEipSegment")
            .withUri("/v3/{domain_id}/global-eip-segments/count")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getLimit, CountGlobalEipSegmentRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getOffset, CountGlobalEipSegmentRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getMarker, CountGlobalEipSegmentRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getPageReverse,
                CountGlobalEipSegmentRequest::setPageReverse));
        builder.<List<CountGlobalEipSegmentRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getFields, CountGlobalEipSegmentRequest::setFields));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getId, CountGlobalEipSegmentRequest::setId));
        builder.<List<String>>withRequestField("internet_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getInternetBandwidthId,
                CountGlobalEipSegmentRequest::setInternetBandwidthId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getName, CountGlobalEipSegmentRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getNameLike,
                CountGlobalEipSegmentRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAccessSite,
                CountGlobalEipSegmentRequest::setAccessSite));
        builder.<List<String>>withRequestField("geip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getGeipPoolName,
                CountGlobalEipSegmentRequest::setGeipPoolName));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getIsp, CountGlobalEipSegmentRequest::setIsp));
        builder.<List<CountGlobalEipSegmentRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getIpVersion,
                CountGlobalEipSegmentRequest::setIpVersion));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getCidr, CountGlobalEipSegmentRequest::setCidr));
        builder.<List<String>>withRequestField("cidr_v6",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getCidrV6, CountGlobalEipSegmentRequest::setCidrV6));
        builder.<List<Boolean>>withRequestField("freezen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getFreezen, CountGlobalEipSegmentRequest::setFreezen));
        builder.<List<Boolean>>withRequestField("internet_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getInternetBandwidthIsNull,
                CountGlobalEipSegmentRequest::setInternetBandwidthIsNull));
        builder.<List<CountGlobalEipSegmentRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getStatus, CountGlobalEipSegmentRequest::setStatus));
        builder.<List<String>>withRequestField("associate_instance.region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstanceRegion,
                CountGlobalEipSegmentRequest::setAssociateInstanceRegion));
        builder.<List<String>>withRequestField("associate_instance.public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstancePublicBorderGroup,
                CountGlobalEipSegmentRequest::setAssociateInstancePublicBorderGroup));
        builder.<List<String>>withRequestField("associate_instance.instance_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstanceInstanceSite,
                CountGlobalEipSegmentRequest::setAssociateInstanceInstanceSite));
        builder.<List<String>>withRequestField("associate_instance.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstanceInstanceType,
                CountGlobalEipSegmentRequest::setAssociateInstanceInstanceType));
        builder.<List<String>>withRequestField("associate_instance.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstanceInstanceId,
                CountGlobalEipSegmentRequest::setAssociateInstanceInstanceId));
        builder.<List<String>>withRequestField("associate_instance.project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getAssociateInstanceProjectId,
                CountGlobalEipSegmentRequest::setAssociateInstanceProjectId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getEnterpriseProjectId,
                CountGlobalEipSegmentRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipSegmentRequest::getTags, CountGlobalEipSegmentRequest::setTags));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountGlobalEipSegmentResponse::getXRequestId,
                CountGlobalEipSegmentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CountGlobalEipsRequest, CountGlobalEipsResponse> countGlobalEips =
        genForCountGlobalEips();

    private static HttpRequestDef<CountGlobalEipsRequest, CountGlobalEipsResponse> genForCountGlobalEips() {
        // basic
        HttpRequestDef.Builder<CountGlobalEipsRequest, CountGlobalEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountGlobalEipsRequest.class, CountGlobalEipsResponse.class)
                .withName("CountGlobalEips")
                .withUri("/v3/{domain_id}/global-eips/count")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getId, CountGlobalEipsRequest::setId));
        builder.<List<String>>withRequestField("internet_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getInternetBandwidthId,
                CountGlobalEipsRequest::setInternetBandwidthId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getName, CountGlobalEipsRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getNameLike, CountGlobalEipsRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAccessSite, CountGlobalEipsRequest::setAccessSite));
        builder.<List<String>>withRequestField("geip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getGeipPoolName, CountGlobalEipsRequest::setGeipPoolName));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getIsp, CountGlobalEipsRequest::setIsp));
        builder.<List<CountGlobalEipsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getIpVersion, CountGlobalEipsRequest::setIpVersion));
        builder.<List<String>>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getIpAddress, CountGlobalEipsRequest::setIpAddress));
        builder.<List<String>>withRequestField("ipv6_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getIpv6Address, CountGlobalEipsRequest::setIpv6Address));
        builder.<List<Boolean>>withRequestField("freezen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getFreezen, CountGlobalEipsRequest::setFreezen));
        builder.<List<Boolean>>withRequestField("polluted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getPolluted, CountGlobalEipsRequest::setPolluted));
        builder.<List<Boolean>>withRequestField("internet_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getInternetBandwidthIsNull,
                CountGlobalEipsRequest::setInternetBandwidthIsNull));
        builder.<List<Boolean>>withRequestField("gcb_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getGcbBandwidthIsNull,
                CountGlobalEipsRequest::setGcbBandwidthIsNull));
        builder.<List<CountGlobalEipsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getStatus, CountGlobalEipsRequest::setStatus));
        builder.<List<String>>withRequestField("associate_instance_info.region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoRegion,
                CountGlobalEipsRequest::setAssociateInstanceInfoRegion));
        builder.<List<String>>withRequestField("associate_instance_info.public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoPublicBorderGroup,
                CountGlobalEipsRequest::setAssociateInstanceInfoPublicBorderGroup));
        builder.<List<String>>withRequestField("associate_instance_info.instance_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoInstanceSite,
                CountGlobalEipsRequest::setAssociateInstanceInfoInstanceSite));
        builder.<List<String>>withRequestField("associate_instance_info.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoInstanceType,
                CountGlobalEipsRequest::setAssociateInstanceInfoInstanceType));
        builder.<List<String>>withRequestField("associate_instance_info.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoInstanceId,
                CountGlobalEipsRequest::setAssociateInstanceInfoInstanceId));
        builder.<List<String>>withRequestField("associate_instance_info.project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getAssociateInstanceInfoProjectId,
                CountGlobalEipsRequest::setAssociateInstanceInfoProjectId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getEnterpriseProjectId,
                CountGlobalEipsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountGlobalEipsRequest::getTags, CountGlobalEipsRequest::setTags));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountGlobalEipsResponse::getXRequestId, CountGlobalEipsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalEipRequest, CreateGlobalEipResponse> createGlobalEip =
        genForCreateGlobalEip();

    private static HttpRequestDef<CreateGlobalEipRequest, CreateGlobalEipResponse> genForCreateGlobalEip() {
        // basic
        HttpRequestDef.Builder<CreateGlobalEipRequest, CreateGlobalEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGlobalEipRequest.class, CreateGlobalEipResponse.class)
                .withName("CreateGlobalEip")
                .withUri("/v3/{domain_id}/global-eips")
                .withContentType("application/json");

        // requests
        builder.<CreateGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalEipRequestBody.class),
            f -> f.withMarshaller(CreateGlobalEipRequest::getBody, CreateGlobalEipRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateGlobalEipResponse::getXRequestId, CreateGlobalEipResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse> createGlobalEipSegment =
        genForCreateGlobalEipSegment();

    private static HttpRequestDef<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse> genForCreateGlobalEipSegment() {
        // basic
        HttpRequestDef.Builder<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGlobalEipSegmentRequest.class, CreateGlobalEipSegmentResponse.class)
            .withName("CreateGlobalEipSegment")
            .withUri("/v3/{domain_id}/global-eip-segments")
            .withContentType("application/json");

        // requests
        builder.<CreateGlobalEipSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalEipSegmentRequestBody.class),
            f -> f.withMarshaller(CreateGlobalEipSegmentRequest::getBody, CreateGlobalEipSegmentRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateGlobalEipSegmentResponse::getXRequestId,
                CreateGlobalEipSegmentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse> deleteGeipSegmentTag =
        genForDeleteGeipSegmentTag();

    private static HttpRequestDef<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse> genForDeleteGeipSegmentTag() {
        // basic
        HttpRequestDef.Builder<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGeipSegmentTagRequest.class, DeleteGeipSegmentTagResponse.class)
            .withName("DeleteGeipSegmentTag")
            .withUri("/v3/global-eip-segment/{resource_id}/tags/{tag_key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeipSegmentTagRequest::getResourceId,
                DeleteGeipSegmentTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeipSegmentTagRequest::getTagKey, DeleteGeipSegmentTagRequest::setTagKey));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGeipSegmentTagResponse::getXRequestId,
                DeleteGeipSegmentTagResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalEipRequest, DeleteGlobalEipResponse> deleteGlobalEip =
        genForDeleteGlobalEip();

    private static HttpRequestDef<DeleteGlobalEipRequest, DeleteGlobalEipResponse> genForDeleteGlobalEip() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalEipRequest, DeleteGlobalEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGlobalEipRequest.class, DeleteGlobalEipResponse.class)
                .withName("DeleteGlobalEip")
                .withUri("/v3/{domain_id}/global-eips/{global_eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalEipRequest::getGlobalEipId, DeleteGlobalEipRequest::setGlobalEipId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGlobalEipResponse::getXRequestId, DeleteGlobalEipResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse> deleteGlobalEipSegment =
        genForDeleteGlobalEipSegment();

    private static HttpRequestDef<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse> genForDeleteGlobalEipSegment() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGlobalEipSegmentRequest.class, DeleteGlobalEipSegmentResponse.class)
            .withName("DeleteGlobalEipSegment")
            .withUri("/v3/{domain_id}/global-eip-segments/{global_eip_segment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalEipSegmentRequest::getGlobalEipSegmentId,
                DeleteGlobalEipSegmentRequest::setGlobalEipSegmentId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGlobalEipSegmentResponse::getXRequestId,
                DeleteGlobalEipSegmentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse> deleteGlobalEipTag =
        genForDeleteGlobalEipTag();

    private static HttpRequestDef<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse> genForDeleteGlobalEipTag() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGlobalEipTagRequest.class, DeleteGlobalEipTagResponse.class)
                .withName("DeleteGlobalEipTag")
                .withUri("/v3/global-eip/{resource_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalEipTagRequest::getResourceId, DeleteGlobalEipTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalEipTagRequest::getTagKey, DeleteGlobalEipTagRequest::setTagKey));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGlobalEipTagResponse::getXRequestId,
                DeleteGlobalEipTagResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse> detachInternetBandwidth =
        genForDetachInternetBandwidth();

    private static HttpRequestDef<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse> genForDetachInternetBandwidth() {
        // basic
        HttpRequestDef.Builder<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetachInternetBandwidthRequest.class, DetachInternetBandwidthResponse.class)
            .withName("DetachInternetBandwidth")
            .withUri("/v3/{domain_id}/global-eips/{global_eip_id}/detach-internet-bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachInternetBandwidthRequest::getGlobalEipId,
                DetachInternetBandwidthRequest::setGlobalEipId));
        builder.<Boolean>withRequestField("force_unbind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DetachInternetBandwidthRequest::getForceUnbind,
                DetachInternetBandwidthRequest::setForceUnbind));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetachInternetBandwidthResponse::getXRequestId,
                DetachInternetBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse> disassociateGeipSegmentInstance =
        genForDisassociateGeipSegmentInstance();

    private static HttpRequestDef<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse> genForDisassociateGeipSegmentInstance() {
        // basic
        HttpRequestDef.Builder<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateGeipSegmentInstanceRequest.class,
                    DisassociateGeipSegmentInstanceResponse.class)
                .withName("DisassociateGeipSegmentInstance")
                .withUri("/v3/{domain_id}/global-eip-segments/{global_eip_segment_id}/disassociate-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateGeipSegmentInstanceRequest::getGlobalEipSegmentId,
                DisassociateGeipSegmentInstanceRequest::setGlobalEipSegmentId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisassociateGeipSegmentInstanceResponse::getXRequestId,
                DisassociateGeipSegmentInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DisassociateInstanceRequest, DisassociateInstanceResponse> disassociateInstance =
        genForDisassociateInstance();

    private static HttpRequestDef<DisassociateInstanceRequest, DisassociateInstanceResponse> genForDisassociateInstance() {
        // basic
        HttpRequestDef.Builder<DisassociateInstanceRequest, DisassociateInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateInstanceRequest.class, DisassociateInstanceResponse.class)
            .withName("DisassociateInstance")
            .withUri("/v3/{domain_id}/global-eips/{global_eip_id}/disassociate-instance")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateInstanceRequest::getGlobalEipId,
                DisassociateInstanceRequest::setGlobalEipId));
        builder.<Boolean>withRequestField("is_reserve_gcb",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DisassociateInstanceRequest::getIsReserveGcb,
                DisassociateInstanceRequest::setIsReserveGcb));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisassociateInstanceResponse::getXRequestId,
                DisassociateInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGeipPoolsRequest, ListGeipPoolsResponse> listGeipPools =
        genForListGeipPools();

    private static HttpRequestDef<ListGeipPoolsRequest, ListGeipPoolsResponse> genForListGeipPools() {
        // basic
        HttpRequestDef.Builder<ListGeipPoolsRequest, ListGeipPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeipPoolsRequest.class, ListGeipPoolsResponse.class)
                .withName("ListGeipPools")
                .withUri("/v3/{domain_id}/geip/geip-pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getLimit, ListGeipPoolsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getOffset, ListGeipPoolsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getMarker, ListGeipPoolsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getPageReverse, ListGeipPoolsRequest::setPageReverse));
        builder.<List<ListGeipPoolsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getFields, ListGeipPoolsRequest::setFields));
        builder.<List<ListGeipPoolsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getSortKey, ListGeipPoolsRequest::setSortKey));
        builder.<List<ListGeipPoolsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getSortDir, ListGeipPoolsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getId, ListGeipPoolsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getCode, ListGeipPoolsRequest::setCode));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getAccessSite, ListGeipPoolsRequest::setAccessSite));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getIsp, ListGeipPoolsRequest::setIsp));
        builder.<List<ListGeipPoolsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getIpVersion, ListGeipPoolsRequest::setIpVersion));
        builder.<List<ListGeipPoolsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getStatus, ListGeipPoolsRequest::setStatus));
        builder.<List<ListGeipPoolsRequest.TypeEnum>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipPoolsRequest::getType, ListGeipPoolsRequest::setType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeipPoolsResponse::getXRequestId, ListGeipPoolsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse> listGeipSegmentCountFilterTags =
        genForListGeipSegmentCountFilterTags();

    private static HttpRequestDef<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse> genForListGeipSegmentCountFilterTags() {
        // basic
        HttpRequestDef.Builder<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListGeipSegmentCountFilterTagsRequest.class,
                    ListGeipSegmentCountFilterTagsResponse.class)
                .withName("ListGeipSegmentCountFilterTags")
                .withUri("/v3/global-eip-segment/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListGeipSegmentCountFilterTagsRequest::getBody,
                ListGeipSegmentCountFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeipSegmentCountFilterTagsResponse::getXRequestId,
                ListGeipSegmentCountFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse> listGeipSegmentDomainTags =
        genForListGeipSegmentDomainTags();

    private static HttpRequestDef<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse> genForListGeipSegmentDomainTags() {
        // basic
        HttpRequestDef.Builder<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGeipSegmentDomainTagsRequest.class,
                    ListGeipSegmentDomainTagsResponse.class)
                .withName("ListGeipSegmentDomainTags")
                .withUri("/v3/global-eip-segment/tags")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeipSegmentDomainTagsResponse::getXRequestId,
                ListGeipSegmentDomainTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse> listGeipSegmentFilterTags =
        genForListGeipSegmentFilterTags();

    private static HttpRequestDef<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse> genForListGeipSegmentFilterTags() {
        // basic
        HttpRequestDef.Builder<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListGeipSegmentFilterTagsRequest.class,
                    ListGeipSegmentFilterTagsResponse.class)
                .withName("ListGeipSegmentFilterTags")
                .withUri("/v3/global-eip-segment/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<List<Integer>>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipSegmentFilterTagsRequest::getLimit,
                ListGeipSegmentFilterTagsRequest::setLimit));
        builder.<List<Integer>>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGeipSegmentFilterTagsRequest::getOffset,
                ListGeipSegmentFilterTagsRequest::setOffset));
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListGeipSegmentFilterTagsRequest::getBody,
                ListGeipSegmentFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGeipSegmentFilterTagsResponse::getXRequestId,
                ListGeipSegmentFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse> listGlobalEipCountFilterTags =
        genForListGlobalEipCountFilterTags();

    private static HttpRequestDef<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse> genForListGlobalEipCountFilterTags() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListGlobalEipCountFilterTagsRequest.class,
                    ListGlobalEipCountFilterTagsResponse.class)
                .withName("ListGlobalEipCountFilterTags")
                .withUri("/v3/global-eip/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListGlobalEipCountFilterTagsRequest::getBody,
                ListGlobalEipCountFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGlobalEipCountFilterTagsResponse::getXRequestId,
                ListGlobalEipCountFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse> listGlobalEipDomainTags =
        genForListGlobalEipDomainTags();

    private static HttpRequestDef<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse> genForListGlobalEipDomainTags() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGlobalEipDomainTagsRequest.class, ListGlobalEipDomainTagsResponse.class)
            .withName("ListGlobalEipDomainTags")
            .withUri("/v3/global-eip/tags")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGlobalEipDomainTagsResponse::getXRequestId,
                ListGlobalEipDomainTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse> listGlobalEipFilterTags =
        genForListGlobalEipFilterTags();

    private static HttpRequestDef<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse> genForListGlobalEipFilterTags() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListGlobalEipFilterTagsRequest.class, ListGlobalEipFilterTagsResponse.class)
            .withName("ListGlobalEipFilterTags")
            .withUri("/v3/global-eip/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<List<Integer>>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipFilterTagsRequest::getLimit, ListGlobalEipFilterTagsRequest::setLimit));
        builder.<List<Integer>>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipFilterTagsRequest::getOffset,
                ListGlobalEipFilterTagsRequest::setOffset));
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListGlobalEipFilterTagsRequest::getBody, ListGlobalEipFilterTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGlobalEipFilterTagsResponse::getXRequestId,
                ListGlobalEipFilterTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse> listGlobalEipSegments =
        genForListGlobalEipSegments();

    private static HttpRequestDef<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse> genForListGlobalEipSegments() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGlobalEipSegmentsRequest.class, ListGlobalEipSegmentsResponse.class)
            .withName("ListGlobalEipSegments")
            .withUri("/v3/{domain_id}/global-eip-segments")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getLimit, ListGlobalEipSegmentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getOffset, ListGlobalEipSegmentsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getMarker, ListGlobalEipSegmentsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getPageReverse,
                ListGlobalEipSegmentsRequest::setPageReverse));
        builder.<List<ListGlobalEipSegmentsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getFields, ListGlobalEipSegmentsRequest::setFields));
        builder.<List<ListGlobalEipSegmentsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getSortKey, ListGlobalEipSegmentsRequest::setSortKey));
        builder.<List<ListGlobalEipSegmentsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getSortDir, ListGlobalEipSegmentsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getId, ListGlobalEipSegmentsRequest::setId));
        builder.<List<String>>withRequestField("internet_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getInternetBandwidthId,
                ListGlobalEipSegmentsRequest::setInternetBandwidthId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getName, ListGlobalEipSegmentsRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getNameLike,
                ListGlobalEipSegmentsRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAccessSite,
                ListGlobalEipSegmentsRequest::setAccessSite));
        builder.<List<String>>withRequestField("geip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getGeipPoolName,
                ListGlobalEipSegmentsRequest::setGeipPoolName));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getIsp, ListGlobalEipSegmentsRequest::setIsp));
        builder.<List<ListGlobalEipSegmentsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getIpVersion,
                ListGlobalEipSegmentsRequest::setIpVersion));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getCidr, ListGlobalEipSegmentsRequest::setCidr));
        builder.<List<String>>withRequestField("cidr_v6",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getCidrV6, ListGlobalEipSegmentsRequest::setCidrV6));
        builder.<List<Boolean>>withRequestField("freezen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getFreezen, ListGlobalEipSegmentsRequest::setFreezen));
        builder.<List<Boolean>>withRequestField("internet_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getInternetBandwidthIsNull,
                ListGlobalEipSegmentsRequest::setInternetBandwidthIsNull));
        builder.<List<ListGlobalEipSegmentsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getStatus, ListGlobalEipSegmentsRequest::setStatus));
        builder.<List<String>>withRequestField("associate_instance.region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceRegion,
                ListGlobalEipSegmentsRequest::setAssociateInstanceRegion));
        builder.<List<String>>withRequestField("associate_instance.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceInstanceType,
                ListGlobalEipSegmentsRequest::setAssociateInstanceInstanceType));
        builder.<List<String>>withRequestField("associate_instance.public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstancePublicBorderGroup,
                ListGlobalEipSegmentsRequest::setAssociateInstancePublicBorderGroup));
        builder.<List<String>>withRequestField("associate_instance.instance_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceInstanceSite,
                ListGlobalEipSegmentsRequest::setAssociateInstanceInstanceSite));
        builder.<List<String>>withRequestField("associate_instance.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceInstanceId,
                ListGlobalEipSegmentsRequest::setAssociateInstanceInstanceId));
        builder.<List<String>>withRequestField("associate_instance.project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceProjectId,
                ListGlobalEipSegmentsRequest::setAssociateInstanceProjectId));
        builder.<List<String>>withRequestField("associate_instance.service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceServiceId,
                ListGlobalEipSegmentsRequest::setAssociateInstanceServiceId));
        builder.<List<String>>withRequestField("associate_instance.service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getAssociateInstanceServiceType,
                ListGlobalEipSegmentsRequest::setAssociateInstanceServiceType));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getEnterpriseProjectId,
                ListGlobalEipSegmentsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipSegmentsRequest::getTags, ListGlobalEipSegmentsRequest::setTags));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGlobalEipSegmentsResponse::getXRequestId,
                ListGlobalEipSegmentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalEipsRequest, ListGlobalEipsResponse> listGlobalEips =
        genForListGlobalEips();

    private static HttpRequestDef<ListGlobalEipsRequest, ListGlobalEipsResponse> genForListGlobalEips() {
        // basic
        HttpRequestDef.Builder<ListGlobalEipsRequest, ListGlobalEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGlobalEipsRequest.class, ListGlobalEipsResponse.class)
                .withName("ListGlobalEips")
                .withUri("/v3/{domain_id}/global-eips")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getLimit, ListGlobalEipsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getOffset, ListGlobalEipsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getMarker, ListGlobalEipsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getPageReverse, ListGlobalEipsRequest::setPageReverse));
        builder.<List<ListGlobalEipsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getFields, ListGlobalEipsRequest::setFields));
        builder.<List<ListGlobalEipsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getSortKey, ListGlobalEipsRequest::setSortKey));
        builder.<List<ListGlobalEipsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getSortDir, ListGlobalEipsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getId, ListGlobalEipsRequest::setId));
        builder.<List<String>>withRequestField("internet_bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getInternetBandwidthId,
                ListGlobalEipsRequest::setInternetBandwidthId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getName, ListGlobalEipsRequest::setName));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getNameLike, ListGlobalEipsRequest::setNameLike));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAccessSite, ListGlobalEipsRequest::setAccessSite));
        builder.<List<String>>withRequestField("geip_pool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getGeipPoolName, ListGlobalEipsRequest::setGeipPoolName));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getIsp, ListGlobalEipsRequest::setIsp));
        builder.<List<ListGlobalEipsRequest.IpVersionEnum>>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getIpVersion, ListGlobalEipsRequest::setIpVersion));
        builder.<List<String>>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getIpAddress, ListGlobalEipsRequest::setIpAddress));
        builder.<List<String>>withRequestField("ipv6_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getIpv6Address, ListGlobalEipsRequest::setIpv6Address));
        builder.<List<Boolean>>withRequestField("freezen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getFreezen, ListGlobalEipsRequest::setFreezen));
        builder.<List<Boolean>>withRequestField("polluted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getPolluted, ListGlobalEipsRequest::setPolluted));
        builder.<List<Boolean>>withRequestField("internet_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getInternetBandwidthIsNull,
                ListGlobalEipsRequest::setInternetBandwidthIsNull));
        builder.<List<Boolean>>withRequestField("gcb_bandwidth_is_null",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getGcbBandwidthIsNull,
                ListGlobalEipsRequest::setGcbBandwidthIsNull));
        builder.<List<ListGlobalEipsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getStatus, ListGlobalEipsRequest::setStatus));
        builder.<List<String>>withRequestField("associate_instance_info.region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoRegion,
                ListGlobalEipsRequest::setAssociateInstanceInfoRegion));
        builder.<List<String>>withRequestField("associate_instance_info.instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoInstanceType,
                ListGlobalEipsRequest::setAssociateInstanceInfoInstanceType));
        builder.<List<String>>withRequestField("associate_instance_info.public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoPublicBorderGroup,
                ListGlobalEipsRequest::setAssociateInstanceInfoPublicBorderGroup));
        builder.<List<String>>withRequestField("associate_instance_info.instance_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoInstanceSite,
                ListGlobalEipsRequest::setAssociateInstanceInfoInstanceSite));
        builder.<List<String>>withRequestField("associate_instance_info.instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoInstanceId,
                ListGlobalEipsRequest::setAssociateInstanceInfoInstanceId));
        builder.<List<String>>withRequestField("associate_instance_info.project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoProjectId,
                ListGlobalEipsRequest::setAssociateInstanceInfoProjectId));
        builder.<List<String>>withRequestField("associate_instance_info.service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoServiceId,
                ListGlobalEipsRequest::setAssociateInstanceInfoServiceId));
        builder.<List<String>>withRequestField("associate_instance_info.service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getAssociateInstanceInfoServiceType,
                ListGlobalEipsRequest::setAssociateInstanceInfoServiceType));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getEnterpriseProjectId,
                ListGlobalEipsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGlobalEipsRequest::getTags, ListGlobalEipsRequest::setTags));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListGlobalEipsResponse::getXRequestId, ListGlobalEipsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse> showGeipSegmentTags =
        genForShowGeipSegmentTags();

    private static HttpRequestDef<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse> genForShowGeipSegmentTags() {
        // basic
        HttpRequestDef.Builder<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGeipSegmentTagsRequest.class, ShowGeipSegmentTagsResponse.class)
                .withName("ShowGeipSegmentTags")
                .withUri("/v3/global-eip-segment/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeipSegmentTagsRequest::getResourceId,
                ShowGeipSegmentTagsRequest::setResourceId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowGeipSegmentTagsResponse::getXRequestId,
                ShowGeipSegmentTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalEipRequest, ShowGlobalEipResponse> showGlobalEip =
        genForShowGlobalEip();

    private static HttpRequestDef<ShowGlobalEipRequest, ShowGlobalEipResponse> genForShowGlobalEip() {
        // basic
        HttpRequestDef.Builder<ShowGlobalEipRequest, ShowGlobalEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGlobalEipRequest.class, ShowGlobalEipResponse.class)
                .withName("ShowGlobalEip")
                .withUri("/v3/{domain_id}/global-eips/{global_eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlobalEipRequest::getGlobalEipId, ShowGlobalEipRequest::setGlobalEipId));
        builder.<List<ShowGlobalEipRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGlobalEipRequest::getFields, ShowGlobalEipRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowGlobalEipResponse::getXRequestId, ShowGlobalEipResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse> showGlobalEipSegment =
        genForShowGlobalEipSegment();

    private static HttpRequestDef<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse> genForShowGlobalEipSegment() {
        // basic
        HttpRequestDef.Builder<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGlobalEipSegmentRequest.class, ShowGlobalEipSegmentResponse.class)
            .withName("ShowGlobalEipSegment")
            .withUri("/v3/{domain_id}/global-eip-segments/{global_eip_segment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlobalEipSegmentRequest::getGlobalEipSegmentId,
                ShowGlobalEipSegmentRequest::setGlobalEipSegmentId));
        builder.<List<ShowGlobalEipSegmentRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowGlobalEipSegmentRequest::getFields, ShowGlobalEipSegmentRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowGlobalEipSegmentResponse::getXRequestId,
                ShowGlobalEipSegmentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse> showGlobalEipTags =
        genForShowGlobalEipTags();

    private static HttpRequestDef<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse> genForShowGlobalEipTags() {
        // basic
        HttpRequestDef.Builder<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGlobalEipTagsRequest.class, ShowGlobalEipTagsResponse.class)
                .withName("ShowGlobalEipTags")
                .withUri("/v3/global-eip/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlobalEipTagsRequest::getResourceId, ShowGlobalEipTagsRequest::setResourceId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowGlobalEipTagsResponse::getXRequestId, ShowGlobalEipTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalEipRequest, UpdateGlobalEipResponse> updateGlobalEip =
        genForUpdateGlobalEip();

    private static HttpRequestDef<UpdateGlobalEipRequest, UpdateGlobalEipResponse> genForUpdateGlobalEip() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalEipRequest, UpdateGlobalEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGlobalEipRequest.class, UpdateGlobalEipResponse.class)
                .withName("UpdateGlobalEip")
                .withUri("/v3/{domain_id}/global-eips/{global_eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalEipRequest::getGlobalEipId, UpdateGlobalEipRequest::setGlobalEipId));
        builder.<UpdateGlobalEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalEipRequestBody.class),
            f -> f.withMarshaller(UpdateGlobalEipRequest::getBody, UpdateGlobalEipRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGlobalEipResponse::getXRequestId, UpdateGlobalEipResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse> updateGlobalEipSegment =
        genForUpdateGlobalEipSegment();

    private static HttpRequestDef<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse> genForUpdateGlobalEipSegment() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGlobalEipSegmentRequest.class, UpdateGlobalEipSegmentResponse.class)
            .withName("UpdateGlobalEipSegment")
            .withUri("/v3/{domain_id}/global-eip-segments/{global_eip_segment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("global_eip_segment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalEipSegmentRequest::getGlobalEipSegmentId,
                UpdateGlobalEipSegmentRequest::setGlobalEipSegmentId));
        builder.<UpdateGlobalEipSegmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalEipSegmentRequestBody.class),
            f -> f.withMarshaller(UpdateGlobalEipSegmentRequest::getBody, UpdateGlobalEipSegmentRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGlobalEipSegmentResponse::getXRequestId,
                UpdateGlobalEipSegmentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v3/{domain_id}/geip/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getMarker, ListJobsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListJobsRequest::getPageReverse, ListJobsRequest::setPageReverse));
        builder.<List<ListJobsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getFields, ListJobsRequest::setFields));
        builder.<List<ListJobsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getSortKey, ListJobsRequest::setSortKey));
        builder.<List<ListJobsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getSortDir, ListJobsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getId, ListJobsRequest::setId));
        builder.<List<ListJobsRequest.ActionEnum>>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getAction, ListJobsRequest::setAction));
        builder.<List<ListJobsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListJobsResponse::getXRequestId, ListJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowJobsRequest, ShowJobsResponse> showJobs = genForShowJobs();

    private static HttpRequestDef<ShowJobsRequest, ShowJobsResponse> genForShowJobs() {
        // basic
        HttpRequestDef.Builder<ShowJobsRequest, ShowJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobsRequest.class, ShowJobsResponse.class)
                .withName("ShowJobs")
                .withUri("/v3/{domain_id}/geip/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobId, ShowJobsRequest::setJobId));
        builder.<List<ShowJobsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowJobsRequest::getFields, ShowJobsRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowJobsResponse::getXRequestId, ShowJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSupportRegionsRequest, ListSupportRegionsResponse> listSupportRegions =
        genForListSupportRegions();

    private static HttpRequestDef<ListSupportRegionsRequest, ListSupportRegionsResponse> genForListSupportRegions() {
        // basic
        HttpRequestDef.Builder<ListSupportRegionsRequest, ListSupportRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupportRegionsRequest.class, ListSupportRegionsResponse.class)
                .withName("ListSupportRegions")
                .withUri("/v3/{domain_id}/geip/support-regions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getLimit, ListSupportRegionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getOffset, ListSupportRegionsRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getMarker, ListSupportRegionsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getPageReverse,
                ListSupportRegionsRequest::setPageReverse));
        builder.<List<ListSupportRegionsRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getFields, ListSupportRegionsRequest::setFields));
        builder.<List<ListSupportRegionsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getSortKey, ListSupportRegionsRequest::setSortKey));
        builder.<List<ListSupportRegionsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getSortDir, ListSupportRegionsRequest::setSortDir));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getId, ListSupportRegionsRequest::setId));
        builder.<List<String>>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getInstanceType,
                ListSupportRegionsRequest::setInstanceType));
        builder.<List<String>>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getPublicBorderGroup,
                ListSupportRegionsRequest::setPublicBorderGroup));
        builder.<List<String>>withRequestField("access_site",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getAccessSite, ListSupportRegionsRequest::setAccessSite));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getRegionId, ListSupportRegionsRequest::setRegionId));
        builder.<List<String>>withRequestField("remote_endpoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getRemoteEndpoint,
                ListSupportRegionsRequest::setRemoteEndpoint));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSupportRegionsRequest::getStatus, ListSupportRegionsRequest::setStatus));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSupportRegionsResponse::getXRequestId,
                ListSupportRegionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse> listTenantGeipSupportInstances =
        genForListTenantGeipSupportInstances();

    private static HttpRequestDef<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse> genForListTenantGeipSupportInstances() {
        // basic
        HttpRequestDef.Builder<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTenantGeipSupportInstancesRequest.class,
                    ListTenantGeipSupportInstancesResponse.class)
                .withName("ListTenantGeipSupportInstances")
                .withUri("/v3/{domain_id}/global-eips/support-instances/{access_site}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_site",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantGeipSupportInstancesRequest::getAccessSite,
                ListTenantGeipSupportInstancesRequest::setAccessSite));
        builder.<List<ListTenantGeipSupportInstancesRequest.FieldsEnum>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTenantGeipSupportInstancesRequest::getFields,
                ListTenantGeipSupportInstancesRequest::setFields));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTenantGeipSupportInstancesResponse::getXRequestId,
                ListTenantGeipSupportInstancesResponse::setXRequestId));
        return builder.build();
    }

}
