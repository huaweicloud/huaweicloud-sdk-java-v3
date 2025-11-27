package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateGeoIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateGeoIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateAntileakageRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateAntileakageRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateAntitamperRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateAntitamperRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateCustomRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateCustomRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateGeoipRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateGeoipRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateIgnoreRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateIgnoreRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateIpReputationRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateIpReputationRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdatePrivacyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdatePrivacyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateWhiteblackipRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchUpdateWhiteblackipRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmApplicationTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmApplicationTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmAsyncJobRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmAsyncJobResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmDnsDomainRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmDnsDomainResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmProtectionTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmProtectionTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmTmsResourceInstancesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmTmsResourceInstancesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleResponse;
import com.huaweicloud.sdk.waf.v1.model.CopyPolicyByIdRequest;
import com.huaweicloud.sdk.waf.v1.model.CopyPolicyByIdResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateEventExportJobRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateEventExportJobResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventLogRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventLogResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationRequest;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlResponse;
import com.huaweicloud.sdk.waf.v1.model.ListValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ListValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceProgressRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceProgressResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleResponse;

public class WafClient {

    protected HcClient hcClient;

    public WafClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafClient> newBuilder() {
        ClientBuilder<WafClient> clientBuilder = new ClientBuilder<>(WafClient::new);
        return clientBuilder;
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateToHostRequest 请求对象
     * @return ApplyCertificateToHostResponse
     */
    public ApplyCertificateToHostResponse applyCertificateToHost(ApplyCertificateToHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.applyCertificateToHost);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateToHostRequest 请求对象
     * @return SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>
     */
    public SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHostInvoker(
        ApplyCertificateToHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.applyCertificateToHost, hcClient);
    }

    /**
     * 选中多个策略批量添加网页防篡改规则
     *
     * 选中多个策略为这些策略批量添加网页防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntiTamperRuleRequest 请求对象
     * @return BatchCreateAntiTamperRuleResponse
     */
    public BatchCreateAntiTamperRuleResponse batchCreateAntiTamperRule(BatchCreateAntiTamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateAntiTamperRule);
    }

    /**
     * 选中多个策略批量添加网页防篡改规则
     *
     * 选中多个策略为这些策略批量添加网页防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntiTamperRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateAntiTamperRuleRequest, BatchCreateAntiTamperRuleResponse>
     */
    public SyncInvoker<BatchCreateAntiTamperRuleRequest, BatchCreateAntiTamperRuleResponse> batchCreateAntiTamperRuleInvoker(
        BatchCreateAntiTamperRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateAntiTamperRule, hcClient);
    }

    /**
     * 选中多个策略批量添加防敏感信息泄漏规则
     *
     * 选中多个策略为这些策略批量添加防敏感信息泄漏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntileakageRuleRequest 请求对象
     * @return BatchCreateAntileakageRuleResponse
     */
    public BatchCreateAntileakageRuleResponse batchCreateAntileakageRule(BatchCreateAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateAntileakageRule);
    }

    /**
     * 选中多个策略批量添加防敏感信息泄漏规则
     *
     * 选中多个策略为这些策略批量添加防敏感信息泄漏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntileakageRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateAntileakageRuleRequest, BatchCreateAntileakageRuleResponse>
     */
    public SyncInvoker<BatchCreateAntileakageRuleRequest, BatchCreateAntileakageRuleResponse> batchCreateAntileakageRuleInvoker(
        BatchCreateAntileakageRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateAntileakageRule, hcClient);
    }

    /**
     * 选中多个策略为批量添加cc规则
     *
     * 选中多个策略为这些策略批量添加cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCcRuleRequest 请求对象
     * @return BatchCreateCcRuleResponse
     */
    public BatchCreateCcRuleResponse batchCreateCcRule(BatchCreateCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateCcRule);
    }

    /**
     * 选中多个策略为批量添加cc规则
     *
     * 选中多个策略为这些策略批量添加cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCcRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateCcRuleRequest, BatchCreateCcRuleResponse>
     */
    public SyncInvoker<BatchCreateCcRuleRequest, BatchCreateCcRuleResponse> batchCreateCcRuleInvoker(
        BatchCreateCcRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateCcRule, hcClient);
    }

    /**
     * 选中多个策略批量添加精准防护规则
     *
     * 选中多个策略为这些策略批量添加精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCustomRuleRequest 请求对象
     * @return BatchCreateCustomRuleResponse
     */
    public BatchCreateCustomRuleResponse batchCreateCustomRule(BatchCreateCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateCustomRule);
    }

    /**
     * 选中多个策略批量添加精准防护规则
     *
     * 选中多个策略为这些策略批量添加精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCustomRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateCustomRuleRequest, BatchCreateCustomRuleResponse>
     */
    public SyncInvoker<BatchCreateCustomRuleRequest, BatchCreateCustomRuleResponse> batchCreateCustomRuleInvoker(
        BatchCreateCustomRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateCustomRule, hcClient);
    }

    /**
     * 选中多个策略批量添加地理位置访问控制规则
     *
     * 选中多个策略为这些策略批量添加地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeoIpRuleRequest 请求对象
     * @return BatchCreateGeoIpRuleResponse
     */
    public BatchCreateGeoIpRuleResponse batchCreateGeoIpRule(BatchCreateGeoIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateGeoIpRule);
    }

    /**
     * 选中多个策略批量添加地理位置访问控制规则
     *
     * 选中多个策略为这些策略批量添加地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeoIpRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateGeoIpRuleRequest, BatchCreateGeoIpRuleResponse>
     */
    public SyncInvoker<BatchCreateGeoIpRuleRequest, BatchCreateGeoIpRuleResponse> batchCreateGeoIpRuleInvoker(
        BatchCreateGeoIpRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateGeoIpRule, hcClient);
    }

    /**
     * 选中多个策略批量添加全局白名单规则
     *
     * 选中多个策略为这些策略批量添加全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIgnoreRuleRequest 请求对象
     * @return BatchCreateIgnoreRuleResponse
     */
    public BatchCreateIgnoreRuleResponse batchCreateIgnoreRule(BatchCreateIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateIgnoreRule);
    }

    /**
     * 选中多个策略批量添加全局白名单规则
     *
     * 选中多个策略为这些策略批量添加全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIgnoreRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateIgnoreRuleRequest, BatchCreateIgnoreRuleResponse>
     */
    public SyncInvoker<BatchCreateIgnoreRuleRequest, BatchCreateIgnoreRuleResponse> batchCreateIgnoreRuleInvoker(
        BatchCreateIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateIgnoreRule, hcClient);
    }

    /**
     * 为多个策略批量添加威胁情报访问控制规则
     *
     * 选中多个策略为这些策略批量添加威胁情报访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpReputationRuleRequest 请求对象
     * @return BatchCreateIpReputationRuleResponse
     */
    public BatchCreateIpReputationRuleResponse batchCreateIpReputationRule(BatchCreateIpReputationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateIpReputationRule);
    }

    /**
     * 为多个策略批量添加威胁情报访问控制规则
     *
     * 选中多个策略为这些策略批量添加威胁情报访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpReputationRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateIpReputationRuleRequest, BatchCreateIpReputationRuleResponse>
     */
    public SyncInvoker<BatchCreateIpReputationRuleRequest, BatchCreateIpReputationRuleResponse> batchCreateIpReputationRuleInvoker(
        BatchCreateIpReputationRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateIpReputationRule, hcClient);
    }

    /**
     * 选中多个策略批量添加隐私屏蔽防护防护规则
     *
     * 选中多个策略为这些策略批量添加隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivacyRuleRequest 请求对象
     * @return BatchCreatePrivacyRuleResponse
     */
    public BatchCreatePrivacyRuleResponse batchCreatePrivacyRule(BatchCreatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreatePrivacyRule);
    }

    /**
     * 选中多个策略批量添加隐私屏蔽防护防护规则
     *
     * 选中多个策略为这些策略批量添加隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<BatchCreatePrivacyRuleRequest, BatchCreatePrivacyRuleResponse>
     */
    public SyncInvoker<BatchCreatePrivacyRuleRequest, BatchCreatePrivacyRuleResponse> batchCreatePrivacyRuleInvoker(
        BatchCreatePrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreatePrivacyRule, hcClient);
    }

    /**
     * 选中多个策略批量添加黑白名单防护规则
     *
     * 选中多个策略为这些策略批量添加黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateWhiteblackipRuleRequest 请求对象
     * @return BatchCreateWhiteblackipRuleResponse
     */
    public BatchCreateWhiteblackipRuleResponse batchCreateWhiteblackipRule(BatchCreateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchCreateWhiteblackipRule);
    }

    /**
     * 选中多个策略批量添加黑白名单防护规则
     *
     * 选中多个策略为这些策略批量添加黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateWhiteblackipRuleRequest, BatchCreateWhiteblackipRuleResponse>
     */
    public SyncInvoker<BatchCreateWhiteblackipRuleRequest, BatchCreateWhiteblackipRuleResponse> batchCreateWhiteblackipRuleInvoker(
        BatchCreateWhiteblackipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchCreateWhiteblackipRule, hcClient);
    }

    /**
     * 批量删除告警通知
     *
     * 批量删除告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlertNoticeConfigRequest 请求对象
     * @return BatchDeleteAlertNoticeConfigResponse
     */
    public BatchDeleteAlertNoticeConfigResponse batchDeleteAlertNoticeConfig(
        BatchDeleteAlertNoticeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchDeleteAlertNoticeConfig);
    }

    /**
     * 批量删除告警通知
     *
     * 批量删除告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlertNoticeConfigRequest 请求对象
     * @return SyncInvoker<BatchDeleteAlertNoticeConfigRequest, BatchDeleteAlertNoticeConfigResponse>
     */
    public SyncInvoker<BatchDeleteAlertNoticeConfigRequest, BatchDeleteAlertNoticeConfigResponse> batchDeleteAlertNoticeConfigInvoker(
        BatchDeleteAlertNoticeConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchDeleteAlertNoticeConfig, hcClient);
    }

    /**
     * 批量删除租户域名
     *
     * 批量删除租户域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCompositeHostsRequest 请求对象
     * @return BatchDeleteCompositeHostsResponse
     */
    public BatchDeleteCompositeHostsResponse batchDeleteCompositeHosts(BatchDeleteCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchDeleteCompositeHosts);
    }

    /**
     * 批量删除租户域名
     *
     * 批量删除租户域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCompositeHostsRequest 请求对象
     * @return SyncInvoker<BatchDeleteCompositeHostsRequest, BatchDeleteCompositeHostsResponse>
     */
    public SyncInvoker<BatchDeleteCompositeHostsRequest, BatchDeleteCompositeHostsResponse> batchDeleteCompositeHostsInvoker(
        BatchDeleteCompositeHostsRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchDeleteCompositeHosts, hcClient);
    }

    /**
     * 批量删除防护策略
     *
     * 批量删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoliciesRequest 请求对象
     * @return BatchDeletePoliciesResponse
     */
    public BatchDeletePoliciesResponse batchDeletePolicies(BatchDeletePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchDeletePolicies);
    }

    /**
     * 批量删除防护策略
     *
     * 批量删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse>
     */
    public SyncInvoker<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse> batchDeletePoliciesInvoker(
        BatchDeletePoliciesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchDeletePolicies, hcClient);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRulesRequest 请求对象
     * @return BatchDeleteRulesResponse
     */
    public BatchDeleteRulesResponse batchDeleteRules(BatchDeleteRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchDeleteRules);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>
     */
    public SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRulesInvoker(
        BatchDeleteRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchDeleteRules, hcClient);
    }

    /**
     * 批量更新防敏感信息泄露规则
     *
     * 批量修改防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAntileakageRulesRequest 请求对象
     * @return BatchUpdateAntileakageRulesResponse
     */
    public BatchUpdateAntileakageRulesResponse batchUpdateAntileakageRules(BatchUpdateAntileakageRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateAntileakageRules);
    }

    /**
     * 批量更新防敏感信息泄露规则
     *
     * 批量修改防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAntileakageRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateAntileakageRulesRequest, BatchUpdateAntileakageRulesResponse>
     */
    public SyncInvoker<BatchUpdateAntileakageRulesRequest, BatchUpdateAntileakageRulesResponse> batchUpdateAntileakageRulesInvoker(
        BatchUpdateAntileakageRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateAntileakageRules, hcClient);
    }

    /**
     * 批量更新网页防篡改规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAntitamperRulesRequest 请求对象
     * @return BatchUpdateAntitamperRulesResponse
     */
    public BatchUpdateAntitamperRulesResponse batchUpdateAntitamperRules(BatchUpdateAntitamperRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateAntitamperRules);
    }

    /**
     * 批量更新网页防篡改规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAntitamperRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateAntitamperRulesRequest, BatchUpdateAntitamperRulesResponse>
     */
    public SyncInvoker<BatchUpdateAntitamperRulesRequest, BatchUpdateAntitamperRulesResponse> batchUpdateAntitamperRulesInvoker(
        BatchUpdateAntitamperRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateAntitamperRules, hcClient);
    }

    /**
     * 批量修改CC防护规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCcRulesRequest 请求对象
     * @return BatchUpdateCcRulesResponse
     */
    public BatchUpdateCcRulesResponse batchUpdateCcRules(BatchUpdateCcRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateCcRules);
    }

    /**
     * 批量修改CC防护规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCcRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateCcRulesRequest, BatchUpdateCcRulesResponse>
     */
    public SyncInvoker<BatchUpdateCcRulesRequest, BatchUpdateCcRulesResponse> batchUpdateCcRulesInvoker(
        BatchUpdateCcRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateCcRules, hcClient);
    }

    /**
     * 批量更新精准防护规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCustomRulesRequest 请求对象
     * @return BatchUpdateCustomRulesResponse
     */
    public BatchUpdateCustomRulesResponse batchUpdateCustomRules(BatchUpdateCustomRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateCustomRules);
    }

    /**
     * 批量更新精准防护规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCustomRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateCustomRulesRequest, BatchUpdateCustomRulesResponse>
     */
    public SyncInvoker<BatchUpdateCustomRulesRequest, BatchUpdateCustomRulesResponse> batchUpdateCustomRulesInvoker(
        BatchUpdateCustomRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateCustomRules, hcClient);
    }

    /**
     * 批量修改地理位置访问控制规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateGeoipRulesRequest 请求对象
     * @return BatchUpdateGeoipRulesResponse
     */
    public BatchUpdateGeoipRulesResponse batchUpdateGeoipRules(BatchUpdateGeoipRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateGeoipRules);
    }

    /**
     * 批量修改地理位置访问控制规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateGeoipRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateGeoipRulesRequest, BatchUpdateGeoipRulesResponse>
     */
    public SyncInvoker<BatchUpdateGeoipRulesRequest, BatchUpdateGeoipRulesResponse> batchUpdateGeoipRulesInvoker(
        BatchUpdateGeoipRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateGeoipRules, hcClient);
    }

    /**
     * 批量更新全局白名单规则
     *
     * 批量修改全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateIgnoreRulesRequest 请求对象
     * @return BatchUpdateIgnoreRulesResponse
     */
    public BatchUpdateIgnoreRulesResponse batchUpdateIgnoreRules(BatchUpdateIgnoreRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateIgnoreRules);
    }

    /**
     * 批量更新全局白名单规则
     *
     * 批量修改全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateIgnoreRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateIgnoreRulesRequest, BatchUpdateIgnoreRulesResponse>
     */
    public SyncInvoker<BatchUpdateIgnoreRulesRequest, BatchUpdateIgnoreRulesResponse> batchUpdateIgnoreRulesInvoker(
        BatchUpdateIgnoreRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateIgnoreRules, hcClient);
    }

    /**
     * 批量更新威胁情报规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateIpReputationRulesRequest 请求对象
     * @return BatchUpdateIpReputationRulesResponse
     */
    public BatchUpdateIpReputationRulesResponse batchUpdateIpReputationRules(
        BatchUpdateIpReputationRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateIpReputationRules);
    }

    /**
     * 批量更新威胁情报规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateIpReputationRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateIpReputationRulesRequest, BatchUpdateIpReputationRulesResponse>
     */
    public SyncInvoker<BatchUpdateIpReputationRulesRequest, BatchUpdateIpReputationRulesResponse> batchUpdateIpReputationRulesInvoker(
        BatchUpdateIpReputationRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateIpReputationRules, hcClient);
    }

    /**
     * 批量更新隐私屏蔽规则
     *
     * 批量修改全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePrivacyRulesRequest 请求对象
     * @return BatchUpdatePrivacyRulesResponse
     */
    public BatchUpdatePrivacyRulesResponse batchUpdatePrivacyRules(BatchUpdatePrivacyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdatePrivacyRules);
    }

    /**
     * 批量更新隐私屏蔽规则
     *
     * 批量修改全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePrivacyRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdatePrivacyRulesRequest, BatchUpdatePrivacyRulesResponse>
     */
    public SyncInvoker<BatchUpdatePrivacyRulesRequest, BatchUpdatePrivacyRulesResponse> batchUpdatePrivacyRulesInvoker(
        BatchUpdatePrivacyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdatePrivacyRules, hcClient);
    }

    /**
     * 批量更新黑白名单设置规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWhiteblackipRulesRequest 请求对象
     * @return BatchUpdateWhiteblackipRulesResponse
     */
    public BatchUpdateWhiteblackipRulesResponse batchUpdateWhiteblackipRules(
        BatchUpdateWhiteblackipRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.batchUpdateWhiteblackipRules);
    }

    /**
     * 批量更新黑白名单设置规则
     *
     * 批量修改地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateWhiteblackipRulesRequest 请求对象
     * @return SyncInvoker<BatchUpdateWhiteblackipRulesRequest, BatchUpdateWhiteblackipRulesResponse>
     */
    public SyncInvoker<BatchUpdateWhiteblackipRulesRequest, BatchUpdateWhiteblackipRulesResponse> batchUpdateWhiteblackipRulesInvoker(
        BatchUpdateWhiteblackipRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.batchUpdateWhiteblackipRules, hcClient);
    }

    /**
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePrepaidCloudWafRequest 请求对象
     * @return ChangePrepaidCloudWafResponse
     */
    public ChangePrepaidCloudWafResponse changePrepaidCloudWaf(ChangePrepaidCloudWafRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.changePrepaidCloudWaf);
    }

    /**
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePrepaidCloudWafRequest 请求对象
     * @return SyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>
     */
    public SyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWafInvoker(
        ChangePrepaidCloudWafRequest request) {
        return new SyncInvoker<>(request, WafMeta.changePrepaidCloudWaf, hcClient);
    }

    /**
     * 查询独享引擎代理
     *
     * 查询独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return CheckAgencyResponse
     */
    public CheckAgencyResponse checkAgency(CheckAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.checkAgency);
    }

    /**
     * 查询独享引擎代理
     *
     * 查询独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return SyncInvoker<CheckAgencyRequest, CheckAgencyResponse>
     */
    public SyncInvoker<CheckAgencyRequest, CheckAgencyResponse> checkAgencyInvoker(CheckAgencyRequest request) {
        return new SyncInvoker<>(request, WafMeta.checkAgency, hcClient);
    }

    /**
     * 按application规则类型获取内置规则类型
     *
     * 按application规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApplicationTypesRequest 请求对象
     * @return ConfirmApplicationTypesResponse
     */
    public ConfirmApplicationTypesResponse confirmApplicationTypes(ConfirmApplicationTypesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmApplicationTypes);
    }

    /**
     * 按application规则类型获取内置规则类型
     *
     * 按application规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApplicationTypesRequest 请求对象
     * @return SyncInvoker<ConfirmApplicationTypesRequest, ConfirmApplicationTypesResponse>
     */
    public SyncInvoker<ConfirmApplicationTypesRequest, ConfirmApplicationTypesResponse> confirmApplicationTypesInvoker(
        ConfirmApplicationTypesRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmApplicationTypes, hcClient);
    }

    /**
     * 查询异步任务详情
     *
     * 查询异步任务的执行状态详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAsyncJobRequest 请求对象
     * @return ConfirmAsyncJobResponse
     */
    public ConfirmAsyncJobResponse confirmAsyncJob(ConfirmAsyncJobRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmAsyncJob);
    }

    /**
     * 查询异步任务详情
     *
     * 查询异步任务的执行状态详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAsyncJobRequest 请求对象
     * @return SyncInvoker<ConfirmAsyncJobRequest, ConfirmAsyncJobResponse>
     */
    public SyncInvoker<ConfirmAsyncJobRequest, ConfirmAsyncJobResponse> confirmAsyncJobInvoker(
        ConfirmAsyncJobRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmAsyncJob, hcClient);
    }

    /**
     * 根据Id查询机房IP情报防护规则
     *
     * 根据Id查询机房IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmIpReputationRuleRequest 请求对象
     * @return ConfirmIpReputationRuleResponse
     */
    public ConfirmIpReputationRuleResponse confirmIpReputationRule(ConfirmIpReputationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmIpReputationRule);
    }

    /**
     * 根据Id查询机房IP情报防护规则
     *
     * 根据Id查询机房IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmIpReputationRuleRequest 请求对象
     * @return SyncInvoker<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse>
     */
    public SyncInvoker<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse> confirmIpReputationRuleInvoker(
        ConfirmIpReputationRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmIpReputationRule, hcClient);
    }

    /**
     * 查询敏感信息选项的详细信息
     *
     * 查询敏感信息选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyAntileakageMapRequest 请求对象
     * @return ConfirmPolicyAntileakageMapResponse
     */
    public ConfirmPolicyAntileakageMapResponse confirmPolicyAntileakageMap(ConfirmPolicyAntileakageMapRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmPolicyAntileakageMap);
    }

    /**
     * 查询敏感信息选项的详细信息
     *
     * 查询敏感信息选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyAntileakageMapRequest 请求对象
     * @return SyncInvoker<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse>
     */
    public SyncInvoker<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse> confirmPolicyAntileakageMapInvoker(
        ConfirmPolicyAntileakageMapRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmPolicyAntileakageMap, hcClient);
    }

    /**
     * 查询威胁情报控制防护选项的详细信息
     *
     * 查询威胁情报控制防护选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyIpReputationMapRequest 请求对象
     * @return ConfirmPolicyIpReputationMapResponse
     */
    public ConfirmPolicyIpReputationMapResponse confirmPolicyIpReputationMap(
        ConfirmPolicyIpReputationMapRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmPolicyIpReputationMap);
    }

    /**
     * 查询威胁情报控制防护选项的详细信息
     *
     * 查询威胁情报控制防护选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyIpReputationMapRequest 请求对象
     * @return SyncInvoker<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse>
     */
    public SyncInvoker<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse> confirmPolicyIpReputationMapInvoker(
        ConfirmPolicyIpReputationMapRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmPolicyIpReputationMap, hcClient);
    }

    /**
     * 按防护规则类型获取内置规则类型
     *
     * 按防护规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmProtectionTypesRequest 请求对象
     * @return ConfirmProtectionTypesResponse
     */
    public ConfirmProtectionTypesResponse confirmProtectionTypes(ConfirmProtectionTypesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmProtectionTypes);
    }

    /**
     * 按防护规则类型获取内置规则类型
     *
     * 按防护规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmProtectionTypesRequest 请求对象
     * @return SyncInvoker<ConfirmProtectionTypesRequest, ConfirmProtectionTypesResponse>
     */
    public SyncInvoker<ConfirmProtectionTypesRequest, ConfirmProtectionTypesResponse> confirmProtectionTypesInvoker(
        ConfirmProtectionTypesRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmProtectionTypes, hcClient);
    }

    /**
     * SMN告警通知
     *
     * 查询告警可选事件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmThreatMapRequest 请求对象
     * @return ConfirmThreatMapResponse
     */
    public ConfirmThreatMapResponse confirmThreatMap(ConfirmThreatMapRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmThreatMap);
    }

    /**
     * SMN告警通知
     *
     * 查询告警可选事件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmThreatMapRequest 请求对象
     * @return SyncInvoker<ConfirmThreatMapRequest, ConfirmThreatMapResponse>
     */
    public SyncInvoker<ConfirmThreatMapRequest, ConfirmThreatMapResponse> confirmThreatMapInvoker(
        ConfirmThreatMapRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmThreatMap, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTmsResourceInstancesRequest 请求对象
     * @return ConfirmTmsResourceInstancesResponse
     */
    public ConfirmTmsResourceInstancesResponse confirmTmsResourceInstances(ConfirmTmsResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmTmsResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTmsResourceInstancesRequest 请求对象
     * @return SyncInvoker<ConfirmTmsResourceInstancesRequest, ConfirmTmsResourceInstancesResponse>
     */
    public SyncInvoker<ConfirmTmsResourceInstancesRequest, ConfirmTmsResourceInstancesResponse> confirmTmsResourceInstancesInvoker(
        ConfirmTmsResourceInstancesRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmTmsResourceInstances, hcClient);
    }

    /**
     * 获取用户套餐信息
     *
     * 获取用户购买的WAF规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUserBundleRequest 请求对象
     * @return ConfirmUserBundleResponse
     */
    public ConfirmUserBundleResponse confirmUserBundle(ConfirmUserBundleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmUserBundle);
    }

    /**
     * 获取用户套餐信息
     *
     * 获取用户购买的WAF规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUserBundleRequest 请求对象
     * @return SyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>
     */
    public SyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundleInvoker(
        ConfirmUserBundleRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmUserBundle, hcClient);
    }

    /**
     * 根据Id复制防护策略
     *
     * 根据Id复制防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPolicyByIdRequest 请求对象
     * @return CopyPolicyByIdResponse
     */
    public CopyPolicyByIdResponse copyPolicyById(CopyPolicyByIdRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.copyPolicyById);
    }

    /**
     * 根据Id复制防护策略
     *
     * 根据Id复制防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPolicyByIdRequest 请求对象
     * @return SyncInvoker<CopyPolicyByIdRequest, CopyPolicyByIdResponse>
     */
    public SyncInvoker<CopyPolicyByIdRequest, CopyPolicyByIdResponse> copyPolicyByIdInvoker(
        CopyPolicyByIdRequest request) {
        return new SyncInvoker<>(request, WafMeta.copyPolicyById, hcClient);
    }

    /**
     * 创建代理
     *
     * 创建独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAgency);
    }

    /**
     * 创建代理
     *
     * 创建独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<>(request, WafMeta.createAgency, hcClient);
    }

    /**
     * 创建告警通知
     *
     * 创建告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertNoticeConfigRequest 请求对象
     * @return CreateAlertNoticeConfigResponse
     */
    public CreateAlertNoticeConfigResponse createAlertNoticeConfig(CreateAlertNoticeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAlertNoticeConfig);
    }

    /**
     * 创建告警通知
     *
     * 创建告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertNoticeConfigRequest 请求对象
     * @return SyncInvoker<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse>
     */
    public SyncInvoker<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse> createAlertNoticeConfigInvoker(
        CreateAlertNoticeConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.createAlertNoticeConfig, hcClient);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiTamperRuleRequest 请求对象
     * @return CreateAntiTamperRuleResponse
     */
    public CreateAntiTamperRuleResponse createAntiTamperRule(CreateAntiTamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAntiTamperRule);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiTamperRuleRequest 请求对象
     * @return SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>
     */
    public SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRuleInvoker(
        CreateAntiTamperRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createAntiTamperRule, hcClient);
    }

    /**
     * 创建JS脚本反爬虫规则
     *
     * 创建JS脚本反爬虫规则，在调用此接口创建防护规则前，需要调用更新JS脚本反爬虫规则防护模式（UpdateAnticrawlerRuleType）接口指定防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnticrawlerRuleRequest 请求对象
     * @return CreateAnticrawlerRuleResponse
     */
    public CreateAnticrawlerRuleResponse createAnticrawlerRule(CreateAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAnticrawlerRule);
    }

    /**
     * 创建JS脚本反爬虫规则
     *
     * 创建JS脚本反爬虫规则，在调用此接口创建防护规则前，需要调用更新JS脚本反爬虫规则防护模式（UpdateAnticrawlerRuleType）接口指定防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse>
     */
    public SyncInvoker<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> createAnticrawlerRuleInvoker(
        CreateAnticrawlerRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createAnticrawlerRule, hcClient);
    }

    /**
     * 创建防敏感信息泄露规则
     *
     * 创建防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntileakageRuleRequest 请求对象
     * @return CreateAntileakageRuleResponse
     */
    public CreateAntileakageRuleResponse createAntileakageRule(CreateAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAntileakageRule);
    }

    /**
     * 创建防敏感信息泄露规则
     *
     * 创建防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntileakageRuleRequest 请求对象
     * @return SyncInvoker<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse>
     */
    public SyncInvoker<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> createAntileakageRuleInvoker(
        CreateAntileakageRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createAntileakageRule, hcClient);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCcRuleRequest 请求对象
     * @return CreateCcRuleResponse
     */
    public CreateCcRuleResponse createCcRule(CreateCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCcRule);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCcRuleRequest 请求对象
     * @return SyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>
     */
    public SyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse> createCcRuleInvoker(CreateCcRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createCcRule, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<>(request, WafMeta.createCertificate, hcClient);
    }

    /**
     * 开通云模式按需计费接口
     *
     * 开通云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudWafPostPaidResourceRequest 请求对象
     * @return CreateCloudWafPostPaidResourceResponse
     */
    public CreateCloudWafPostPaidResourceResponse createCloudWafPostPaidResource(
        CreateCloudWafPostPaidResourceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCloudWafPostPaidResource);
    }

    /**
     * 开通云模式按需计费接口
     *
     * 开通云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudWafPostPaidResourceRequest 请求对象
     * @return SyncInvoker<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse>
     */
    public SyncInvoker<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResourceInvoker(
        CreateCloudWafPostPaidResourceRequest request) {
        return new SyncInvoker<>(request, WafMeta.createCloudWafPostPaidResource, hcClient);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomRuleRequest 请求对象
     * @return CreateCustomRuleResponse
     */
    public CreateCustomRuleResponse createCustomRule(CreateCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCustomRule);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomRuleRequest 请求对象
     * @return SyncInvoker<CreateCustomRuleRequest, CreateCustomRuleResponse>
     */
    public SyncInvoker<CreateCustomRuleRequest, CreateCustomRuleResponse> createCustomRuleInvoker(
        CreateCustomRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createCustomRule, hcClient);
    }

    /**
     * 下发自定义导出攻击事件的异步任务
     *
     * 下发自定义导出攻击事件的异步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventExportJobRequest 请求对象
     * @return CreateEventExportJobResponse
     */
    public CreateEventExportJobResponse createEventExportJob(CreateEventExportJobRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createEventExportJob);
    }

    /**
     * 下发自定义导出攻击事件的异步任务
     *
     * 下发自定义导出攻击事件的异步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventExportJobRequest 请求对象
     * @return SyncInvoker<CreateEventExportJobRequest, CreateEventExportJobResponse>
     */
    public SyncInvoker<CreateEventExportJobRequest, CreateEventExportJobResponse> createEventExportJobInvoker(
        CreateEventExportJobRequest request) {
        return new SyncInvoker<>(request, WafMeta.createEventExportJob, hcClient);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeoipRuleRequest 请求对象
     * @return CreateGeoipRuleResponse
     */
    public CreateGeoipRuleResponse createGeoipRule(CreateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeoipRuleRequest 请求对象
     * @return SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>
     */
    public SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRuleInvoker(
        CreateGeoipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createGeoipRule, hcClient);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return CreateHostResponse
     */
    public CreateHostResponse createHost(CreateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createHost);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return SyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public SyncInvoker<CreateHostRequest, CreateHostResponse> createHostInvoker(CreateHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIgnoreRuleRequest 请求对象
     * @return CreateIgnoreRuleResponse
     */
    public CreateIgnoreRuleResponse createIgnoreRule(CreateIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIgnoreRule);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIgnoreRuleRequest 请求对象
     * @return SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>
     */
    public SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRuleInvoker(
        CreateIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createIgnoreRule, hcClient);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式支持的局点包括：华东-青岛、中东-利雅得、华北-北京一、华北-北京四、华北-乌兰察布一、华东-上海一、华东-上海二、华南-广州、华南-深圳、中国-香港、西南-贵阳一、亚太-曼谷、 亚太-新加坡、非洲约翰内斯堡、土耳其-伊斯坦布尔；普通租户类独享支持的局点：华北-北京四、华东-上海一、华南-广州、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createInstance);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式支持的局点包括：华东-青岛、中东-利雅得、华北-北京一、华北-北京四、华北-乌兰察布一、华东-上海一、华东-上海二、华南-广州、华南-深圳、中国-香港、西南-贵阳一、亚太-曼谷、 亚太-新加坡、非洲约翰内斯堡、土耳其-伊斯坦布尔；普通租户类独享支持的局点：华北-北京四、华东-上海一、华南-广州、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.createInstance, hcClient);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIpGroup);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<>(request, WafMeta.createIpGroup, hcClient);
    }

    /**
     * 创建机房IP情报规则
     *
     * 创建IP情报规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpReputationRuleRequest 请求对象
     * @return CreateIpReputationRuleResponse
     */
    public CreateIpReputationRuleResponse createIpReputationRule(CreateIpReputationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIpReputationRule);
    }

    /**
     * 创建机房IP情报规则
     *
     * 创建IP情报规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpReputationRuleRequest 请求对象
     * @return SyncInvoker<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse>
     */
    public SyncInvoker<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse> createIpReputationRuleInvoker(
        CreateIpReputationRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createIpReputationRule, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     *
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePremiumHostRequest 请求对象
     * @return CreatePremiumHostResponse
     */
    public CreatePremiumHostResponse createPremiumHost(CreatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     *
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePremiumHostRequest 请求对象
     * @return SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostInvoker(
        CreatePremiumHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.createPremiumHost, hcClient);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepaidCloudWafRequest 请求对象
     * @return CreatePrepaidCloudWafResponse
     */
    public CreatePrepaidCloudWafResponse createPrepaidCloudWaf(CreatePrepaidCloudWafRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPrepaidCloudWaf);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepaidCloudWafRequest 请求对象
     * @return SyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>
     */
    public SyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWafInvoker(
        CreatePrepaidCloudWafRequest request) {
        return new SyncInvoker<>(request, WafMeta.createPrepaidCloudWaf, hcClient);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivacyRuleRequest 请求对象
     * @return CreatePrivacyRuleResponse
     */
    public CreatePrivacyRuleResponse createPrivacyRule(CreatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPrivacyRule);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>
     */
    public SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRuleInvoker(
        CreatePrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createPrivacyRule, hcClient);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePunishmentRuleRequest 请求对象
     * @return CreatePunishmentRuleResponse
     */
    public CreatePunishmentRuleResponse createPunishmentRule(CreatePunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPunishmentRule);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePunishmentRuleRequest 请求对象
     * @return SyncInvoker<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse>
     */
    public SyncInvoker<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> createPunishmentRuleInvoker(
        CreatePunishmentRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createPunishmentRule, hcClient);
    }

    /**
     * 创建安全报告订阅
     *
     * 创建安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityReportSubscriptionRequest 请求对象
     * @return CreateSecurityReportSubscriptionResponse
     */
    public CreateSecurityReportSubscriptionResponse createSecurityReportSubscription(
        CreateSecurityReportSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createSecurityReportSubscription);
    }

    /**
     * 创建安全报告订阅
     *
     * 创建安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityReportSubscriptionRequest 请求对象
     * @return SyncInvoker<CreateSecurityReportSubscriptionRequest, CreateSecurityReportSubscriptionResponse>
     */
    public SyncInvoker<CreateSecurityReportSubscriptionRequest, CreateSecurityReportSubscriptionResponse> createSecurityReportSubscriptionInvoker(
        CreateSecurityReportSubscriptionRequest request) {
        return new SyncInvoker<>(request, WafMeta.createSecurityReportSubscription, hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateValueListRequest 请求对象
     * @return CreateValueListResponse
     */
    public CreateValueListResponse createValueList(CreateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createValueList);
    }

    /**
     * 创建引用表
     *
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateValueListRequest 请求对象
     * @return SyncInvoker<CreateValueListRequest, CreateValueListResponse>
     */
    public SyncInvoker<CreateValueListRequest, CreateValueListResponse> createValueListInvoker(
        CreateValueListRequest request) {
        return new SyncInvoker<>(request, WafMeta.createValueList, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWhiteblackipRuleRequest 请求对象
     * @return CreateWhiteblackipRuleResponse
     */
    public CreateWhiteblackipRuleResponse createWhiteblackipRule(CreateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createWhiteblackipRule);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>
     */
    public SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRuleInvoker(
        CreateWhiteblackipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.createWhiteblackipRule, hcClient);
    }

    /**
     * 删除代理
     *
     * 删除独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAgency);
    }

    /**
     * 删除代理
     *
     * 删除独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyInvoker(DeleteAgencyRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteAgency, hcClient);
    }

    /**
     * 删除JS脚本反爬虫防护规则
     *
     * 删除JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnticrawlerRuleRequest 请求对象
     * @return DeleteAnticrawlerRuleResponse
     */
    public DeleteAnticrawlerRuleResponse deleteAnticrawlerRule(DeleteAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAnticrawlerRule);
    }

    /**
     * 删除JS脚本反爬虫防护规则
     *
     * 删除JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>
     */
    public SyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleInvoker(
        DeleteAnticrawlerRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteAnticrawlerRule, hcClient);
    }

    /**
     * 删除防敏感信息泄露防护规则
     *
     * 删除防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntileakageRuleRequest 请求对象
     * @return DeleteAntileakageRuleResponse
     */
    public DeleteAntileakageRuleResponse deleteAntileakageRule(DeleteAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAntileakageRule);
    }

    /**
     * 删除防敏感信息泄露防护规则
     *
     * 删除防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntileakageRuleRequest 请求对象
     * @return SyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>
     */
    public SyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRuleInvoker(
        DeleteAntileakageRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteAntileakageRule, hcClient);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntitamperRuleRequest 请求对象
     * @return DeleteAntitamperRuleResponse
     */
    public DeleteAntitamperRuleResponse deleteAntitamperRule(DeleteAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAntitamperRule);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntitamperRuleRequest 请求对象
     * @return SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>
     */
    public SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRuleInvoker(
        DeleteAntitamperRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteAntitamperRule, hcClient);
    }

    /**
     * 删除cc防护规则
     *
     * 删除cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcRuleRequest 请求对象
     * @return DeleteCcRuleResponse
     */
    public DeleteCcRuleResponse deleteCcRule(DeleteCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCcRule);
    }

    /**
     * 删除cc防护规则
     *
     * 删除cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcRuleRequest 请求对象
     * @return SyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>
     */
    public SyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRuleInvoker(DeleteCcRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteCcRule, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteCertificate, hcClient);
    }

    /**
     * 关闭云模式按需计费接口
     *
     * 关闭云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudWafPostPaidResourceRequest 请求对象
     * @return DeleteCloudWafPostPaidResourceResponse
     */
    public DeleteCloudWafPostPaidResourceResponse deleteCloudWafPostPaidResource(
        DeleteCloudWafPostPaidResourceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCloudWafPostPaidResource);
    }

    /**
     * 关闭云模式按需计费接口
     *
     * 关闭云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudWafPostPaidResourceRequest 请求对象
     * @return SyncInvoker<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse>
     */
    public SyncInvoker<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResourceInvoker(
        DeleteCloudWafPostPaidResourceRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteCloudWafPostPaidResource, hcClient);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRuleRequest 请求对象
     * @return DeleteCustomRuleResponse
     */
    public DeleteCustomRuleResponse deleteCustomRule(DeleteCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCustomRule);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRuleRequest 请求对象
     * @return SyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>
     */
    public SyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRuleInvoker(
        DeleteCustomRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteCustomRule, hcClient);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeoipRuleRequest 请求对象
     * @return DeleteGeoipRuleResponse
     */
    public DeleteGeoipRuleResponse deleteGeoipRule(DeleteGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeoipRuleRequest 请求对象
     * @return SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleInvoker(
        DeleteGeoipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteGeoipRule, hcClient);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteHost);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return SyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public SyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostInvoker(DeleteHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIgnoreRuleRequest 请求对象
     * @return DeleteIgnoreRuleResponse
     */
    public DeleteIgnoreRuleResponse deleteIgnoreRule(DeleteIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIgnoreRule);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIgnoreRuleRequest 请求对象
     * @return SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>
     */
    public SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRuleInvoker(
        DeleteIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteIgnoreRule, hcClient);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteInstance);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteInstance, hcClient);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIpGroup);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteIpGroup, hcClient);
    }

    /**
     * 删除机房IP情报防护规则
     *
     * 删除IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpReputationRuleRequest 请求对象
     * @return DeleteIpReputationRuleResponse
     */
    public DeleteIpReputationRuleResponse deleteIpReputationRule(DeleteIpReputationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIpReputationRule);
    }

    /**
     * 删除机房IP情报防护规则
     *
     * 删除IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpReputationRuleRequest 请求对象
     * @return SyncInvoker<DeleteIpReputationRuleRequest, DeleteIpReputationRuleResponse>
     */
    public SyncInvoker<DeleteIpReputationRuleRequest, DeleteIpReputationRuleResponse> deleteIpReputationRuleInvoker(
        DeleteIpReputationRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteIpReputationRule, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePremiumHostRequest 请求对象
     * @return DeletePremiumHostResponse
     */
    public DeletePremiumHostResponse deletePremiumHost(DeletePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePremiumHostRequest 请求对象
     * @return SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostInvoker(
        DeletePremiumHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.deletePremiumHost, hcClient);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivacyRuleRequest 请求对象
     * @return DeletePrivacyRuleResponse
     */
    public DeletePrivacyRuleResponse deletePrivacyRule(DeletePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePrivacyRule);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivacyRuleRequest 请求对象
     * @return SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>
     */
    public SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRuleInvoker(
        DeletePrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deletePrivacyRule, hcClient);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePunishmentRuleRequest 请求对象
     * @return DeletePunishmentRuleResponse
     */
    public DeletePunishmentRuleResponse deletePunishmentRule(DeletePunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePunishmentRule);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePunishmentRuleRequest 请求对象
     * @return SyncInvoker<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse>
     */
    public SyncInvoker<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> deletePunishmentRuleInvoker(
        DeletePunishmentRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deletePunishmentRule, hcClient);
    }

    /**
     * 删除安全报告订阅
     *
     * 删除安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityReportSubscriptionRequest 请求对象
     * @return DeleteSecurityReportSubscriptionResponse
     */
    public DeleteSecurityReportSubscriptionResponse deleteSecurityReportSubscription(
        DeleteSecurityReportSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteSecurityReportSubscription);
    }

    /**
     * 删除安全报告订阅
     *
     * 删除安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityReportSubscriptionRequest 请求对象
     * @return SyncInvoker<DeleteSecurityReportSubscriptionRequest, DeleteSecurityReportSubscriptionResponse>
     */
    public SyncInvoker<DeleteSecurityReportSubscriptionRequest, DeleteSecurityReportSubscriptionResponse> deleteSecurityReportSubscriptionInvoker(
        DeleteSecurityReportSubscriptionRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteSecurityReportSubscription, hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteValueListRequest 请求对象
     * @return DeleteValueListResponse
     */
    public DeleteValueListResponse deleteValueList(DeleteValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteValueList);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteValueListRequest 请求对象
     * @return SyncInvoker<DeleteValueListRequest, DeleteValueListResponse>
     */
    public SyncInvoker<DeleteValueListRequest, DeleteValueListResponse> deleteValueListInvoker(
        DeleteValueListRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteValueList, hcClient);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWhiteBlackIpRuleRequest 请求对象
     * @return DeleteWhiteBlackIpRuleResponse
     */
    public DeleteWhiteBlackIpRuleResponse deleteWhiteBlackIpRule(DeleteWhiteBlackIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteWhiteBlackIpRule);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWhiteBlackIpRuleRequest 请求对象
     * @return SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>
     */
    public SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleInvoker(
        DeleteWhiteBlackIpRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.deleteWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询所有策略网页防篡改
     *
     * 查询所有策略网页防篡改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiTamperPolicyRulesRequest 请求对象
     * @return ListAntiTamperPolicyRulesResponse
     */
    public ListAntiTamperPolicyRulesResponse listAntiTamperPolicyRules(ListAntiTamperPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntiTamperPolicyRules);
    }

    /**
     * 查询所有策略网页防篡改
     *
     * 查询所有策略网页防篡改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiTamperPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse>
     */
    public SyncInvoker<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse> listAntiTamperPolicyRulesInvoker(
        ListAntiTamperPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAntiTamperPolicyRules, hcClient);
    }

    /**
     * 查询JS脚本反爬虫规则列表
     *
     * 查询JS脚本反爬虫规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnticrawlerRulesRequest 请求对象
     * @return ListAnticrawlerRulesResponse
     */
    public ListAnticrawlerRulesResponse listAnticrawlerRules(ListAnticrawlerRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAnticrawlerRules);
    }

    /**
     * 查询JS脚本反爬虫规则列表
     *
     * 查询JS脚本反爬虫规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnticrawlerRulesRequest 请求对象
     * @return SyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>
     */
    public SyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRulesInvoker(
        ListAnticrawlerRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAnticrawlerRules, hcClient);
    }

    /**
     * 查询所有策略防敏感信息泄露规则
     *
     * 查询所有策略防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakagePolicyRulesRequest 请求对象
     * @return ListAntileakagePolicyRulesResponse
     */
    public ListAntileakagePolicyRulesResponse listAntileakagePolicyRules(ListAntileakagePolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntileakagePolicyRules);
    }

    /**
     * 查询所有策略防敏感信息泄露规则
     *
     * 查询所有策略防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakagePolicyRulesRequest 请求对象
     * @return SyncInvoker<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse>
     */
    public SyncInvoker<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse> listAntileakagePolicyRulesInvoker(
        ListAntileakagePolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAntileakagePolicyRules, hcClient);
    }

    /**
     * 查询防敏感信息泄露规则列表
     *
     * 查询防敏感信息泄露规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakageRulesRequest 请求对象
     * @return ListAntileakageRulesResponse
     */
    public ListAntileakageRulesResponse listAntileakageRules(ListAntileakageRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntileakageRules);
    }

    /**
     * 查询防敏感信息泄露规则列表
     *
     * 查询防敏感信息泄露规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakageRulesRequest 请求对象
     * @return SyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>
     */
    public SyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRulesInvoker(
        ListAntileakageRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAntileakageRules, hcClient);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntitamperRuleRequest 请求对象
     * @return ListAntitamperRuleResponse
     */
    public ListAntitamperRuleResponse listAntitamperRule(ListAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntitamperRule);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntitamperRuleRequest 请求对象
     * @return SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>
     */
    public SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRuleInvoker(
        ListAntitamperRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAntitamperRule, hcClient);
    }

    /**
     * 查询攻击防护类型
     *
     * 查询攻击防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackActionTypesRequest 请求对象
     * @return ListAttackActionTypesResponse
     */
    public ListAttackActionTypesResponse listAttackActionTypes(ListAttackActionTypesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAttackActionTypes);
    }

    /**
     * 查询攻击防护类型
     *
     * 查询攻击防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackActionTypesRequest 请求对象
     * @return SyncInvoker<ListAttackActionTypesRequest, ListAttackActionTypesResponse>
     */
    public SyncInvoker<ListAttackActionTypesRequest, ListAttackActionTypesResponse> listAttackActionTypesInvoker(
        ListAttackActionTypesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listAttackActionTypes, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthTimelineRequest 请求对象
     * @return ListBandwidthTimelineResponse
     */
    public ListBandwidthTimelineResponse listBandwidthTimeline(ListBandwidthTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthTimelineRequest 请求对象
     * @return SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineInvoker(
        ListBandwidthTimelineRequest request) {
        return new SyncInvoker<>(request, WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询所有策略CC规则
     *
     * 查询所有策略CC规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcPolicyRulesRequest 请求对象
     * @return ListCcPolicyRulesResponse
     */
    public ListCcPolicyRulesResponse listCcPolicyRules(ListCcPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCcPolicyRules);
    }

    /**
     * 查询所有策略CC规则
     *
     * 查询所有策略CC规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse>
     */
    public SyncInvoker<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse> listCcPolicyRulesInvoker(
        ListCcPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCcPolicyRules, hcClient);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcRulesRequest 请求对象
     * @return ListCcRulesResponse
     */
    public ListCcRulesResponse listCcRules(ListCcRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCcRules);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcRulesRequest 请求对象
     * @return SyncInvoker<ListCcRulesRequest, ListCcRulesResponse>
     */
    public SyncInvoker<ListCcRulesRequest, ListCcRulesResponse> listCcRulesInvoker(ListCcRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCcRules, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCertificates, hcClient);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompositeHostsRequest 请求对象
     * @return ListCompositeHostsResponse
     */
    public ListCompositeHostsResponse listCompositeHosts(ListCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCompositeHosts);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompositeHostsRequest 请求对象
     * @return SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>
     */
    public SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHostsInvoker(
        ListCompositeHostsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCompositeHosts, hcClient);
    }

    /**
     * 查询所有策略精准防护规则
     *
     * 查询所有策略精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPolicyRulesRequest 请求对象
     * @return ListCustomPolicyRulesResponse
     */
    public ListCustomPolicyRulesResponse listCustomPolicyRules(ListCustomPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCustomPolicyRules);
    }

    /**
     * 查询所有策略精准防护规则
     *
     * 查询所有策略精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse>
     */
    public SyncInvoker<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse> listCustomPolicyRulesInvoker(
        ListCustomPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCustomPolicyRules, hcClient);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomRulesRequest 请求对象
     * @return ListCustomRulesResponse
     */
    public ListCustomRulesResponse listCustomRules(ListCustomRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCustomRules);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomRulesRequest 请求对象
     * @return SyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>
     */
    public SyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRulesInvoker(
        ListCustomRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listCustomRules, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventRequest 请求对象
     * @return ListEventResponse
     */
    public ListEventResponse listEvent(ListEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventRequest 请求对象
     * @return SyncInvoker<ListEventRequest, ListEventResponse>
     */
    public SyncInvoker<ListEventRequest, ListEventResponse> listEventInvoker(ListEventRequest request) {
        return new SyncInvoker<>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询事件日志下载的url
     *
     * 查询事件日志下载的url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventLogRequest 请求对象
     * @return ListEventLogResponse
     */
    public ListEventLogResponse listEventLog(ListEventLogRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEventLog);
    }

    /**
     * 查询事件日志下载的url
     *
     * 查询事件日志下载的url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventLogRequest 请求对象
     * @return SyncInvoker<ListEventLogRequest, ListEventLogResponse>
     */
    public SyncInvoker<ListEventLogRequest, ListEventLogResponse> listEventLogInvoker(ListEventLogRequest request) {
        return new SyncInvoker<>(request, WafMeta.listEventLog, hcClient);
    }

    /**
     * 查询所有策略地理位置访问控制
     *
     * 查询所有策略地理位置访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoIpPolicyRulesRequest 请求对象
     * @return ListGeoIpPolicyRulesResponse
     */
    public ListGeoIpPolicyRulesResponse listGeoIpPolicyRules(ListGeoIpPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listGeoIpPolicyRules);
    }

    /**
     * 查询所有策略地理位置访问控制
     *
     * 查询所有策略地理位置访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoIpPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse>
     */
    public SyncInvoker<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse> listGeoIpPolicyRulesInvoker(
        ListGeoIpPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listGeoIpPolicyRules, hcClient);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoipRuleRequest 请求对象
     * @return ListGeoipRuleResponse
     */
    public ListGeoipRuleResponse listGeoipRule(ListGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoipRuleRequest 请求对象
     * @return SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>
     */
    public SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRuleInvoker(ListGeoipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.listGeoipRule, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return ListHostResponse
     */
    public ListHostResponse listHost(ListHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHost);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return SyncInvoker<ListHostRequest, ListHostResponse>
     */
    public SyncInvoker<ListHostRequest, ListHostResponse> listHostInvoker(ListHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.listHost, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息。 &gt; 该API局点受限使用，后续将下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRouteRequest 请求对象
     * @return ListHostRouteResponse
     */
    public ListHostRouteResponse listHostRoute(ListHostRouteRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHostRoute);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息。 &gt; 该API局点受限使用，后续将下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRouteRequest 请求对象
     * @return SyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public SyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteInvoker(ListHostRouteRequest request) {
        return new SyncInvoker<>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询所有策略全局白名单
     *
     * 查询所有策略全局白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnorePolicyRulesRequest 请求对象
     * @return ListIgnorePolicyRulesResponse
     */
    public ListIgnorePolicyRulesResponse listIgnorePolicyRules(ListIgnorePolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIgnorePolicyRules);
    }

    /**
     * 查询所有策略全局白名单
     *
     * 查询所有策略全局白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnorePolicyRulesRequest 请求对象
     * @return SyncInvoker<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse>
     */
    public SyncInvoker<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse> listIgnorePolicyRulesInvoker(
        ListIgnorePolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listIgnorePolicyRules, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnoreRuleRequest 请求对象
     * @return ListIgnoreRuleResponse
     */
    public ListIgnoreRuleResponse listIgnoreRule(ListIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>
     */
    public SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRuleInvoker(
        ListIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.listIgnoreRule, hcClient);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询WAF独享引擎标签
     *
     * 查询WAF独享引擎标签。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listInstanceTags);
    }

    /**
     * 查询WAF独享引擎标签
     *
     * 查询WAF独享引擎标签。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupRequest 请求对象
     * @return ListIpGroupResponse
     */
    public ListIpGroupResponse listIpGroup(ListIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIpGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupRequest 请求对象
     * @return SyncInvoker<ListIpGroupRequest, ListIpGroupResponse>
     */
    public SyncInvoker<ListIpGroupRequest, ListIpGroupResponse> listIpGroupInvoker(ListIpGroupRequest request) {
        return new SyncInvoker<>(request, WafMeta.listIpGroup, hcClient);
    }

    /**
     * 查询所有策略威胁情报控制规则
     *
     * 查询所有策略威胁情报控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationPolicyRulesRequest 请求对象
     * @return ListIpReputationPolicyRulesResponse
     */
    public ListIpReputationPolicyRulesResponse listIpReputationPolicyRules(ListIpReputationPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIpReputationPolicyRules);
    }

    /**
     * 查询所有策略威胁情报控制规则
     *
     * 查询所有策略威胁情报控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse>
     */
    public SyncInvoker<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse> listIpReputationPolicyRulesInvoker(
        ListIpReputationPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listIpReputationPolicyRules, hcClient);
    }

    /**
     * 查询威胁情报规则列表
     *
     * 查询威胁情报规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationRulesRequest 请求对象
     * @return ListIpReputationRulesResponse
     */
    public ListIpReputationRulesResponse listIpReputationRules(ListIpReputationRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIpReputationRules);
    }

    /**
     * 查询威胁情报规则列表
     *
     * 查询威胁情报规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationRulesRequest 请求对象
     * @return SyncInvoker<ListIpReputationRulesRequest, ListIpReputationRulesResponse>
     */
    public SyncInvoker<ListIpReputationRulesRequest, ListIpReputationRulesResponse> listIpReputationRulesInvoker(
        ListIpReputationRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listIpReputationRules, hcClient);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeConfigsRequest 请求对象
     * @return ListNoticeConfigsResponse
     */
    public ListNoticeConfigsResponse listNoticeConfigs(ListNoticeConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listNoticeConfigs);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeConfigsRequest 请求对象
     * @return SyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>
     */
    public SyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigsInvoker(
        ListNoticeConfigsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listNoticeConfigs, hcClient);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOverviewsClassificationRequest 请求对象
     * @return ListOverviewsClassificationResponse
     */
    public ListOverviewsClassificationResponse listOverviewsClassification(ListOverviewsClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listOverviewsClassification);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOverviewsClassificationRequest 请求对象
     * @return SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>
     */
    public SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassificationInvoker(
        ListOverviewsClassificationRequest request) {
        return new SyncInvoker<>(request, WafMeta.listOverviewsClassification, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPremiumHostRequest 请求对象
     * @return ListPremiumHostResponse
     */
    public ListPremiumHostResponse listPremiumHost(ListPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPremiumHostRequest 请求对象
     * @return SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostInvoker(
        ListPremiumHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.listPremiumHost, hcClient);
    }

    /**
     * 查询所有策略隐私屏蔽防护规则
     *
     * 查询所有策略隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyPolicyRulesRequest 请求对象
     * @return ListPrivacyPolicyRulesResponse
     */
    public ListPrivacyPolicyRulesResponse listPrivacyPolicyRules(ListPrivacyPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPrivacyPolicyRules);
    }

    /**
     * 查询所有策略隐私屏蔽防护规则
     *
     * 查询所有策略隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse>
     */
    public SyncInvoker<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse> listPrivacyPolicyRulesInvoker(
        ListPrivacyPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listPrivacyPolicyRules, hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则列表
     *
     * 查询隐私屏蔽防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyRuleRequest 请求对象
     * @return ListPrivacyRuleResponse
     */
    public ListPrivacyRuleResponse listPrivacyRule(ListPrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则列表
     *
     * 查询隐私屏蔽防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyRuleRequest 请求对象
     * @return SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>
     */
    public SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRuleInvoker(
        ListPrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.listPrivacyRule, hcClient);
    }

    /**
     * 查询可防护的资源列表
     *
     * 查询可防护的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableResourcesRequest 请求对象
     * @return ListProtectableResourcesResponse
     */
    public ListProtectableResourcesResponse listProtectableResources(ListProtectableResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listProtectableResources);
    }

    /**
     * 查询可防护的资源列表
     *
     * 查询可防护的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableResourcesRequest 请求对象
     * @return SyncInvoker<ListProtectableResourcesRequest, ListProtectableResourcesResponse>
     */
    public SyncInvoker<ListProtectableResourcesRequest, ListProtectableResourcesResponse> listProtectableResourcesInvoker(
        ListProtectableResourcesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listProtectableResources, hcClient);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPunishmentRulesRequest 请求对象
     * @return ListPunishmentRulesResponse
     */
    public ListPunishmentRulesResponse listPunishmentRules(ListPunishmentRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPunishmentRules);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPunishmentRulesRequest 请求对象
     * @return SyncInvoker<ListPunishmentRulesRequest, ListPunishmentRulesResponse>
     */
    public SyncInvoker<ListPunishmentRulesRequest, ListPunishmentRulesResponse> listPunishmentRulesInvoker(
        ListPunishmentRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listPunishmentRules, hcClient);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQpsTimelineRequest 请求对象
     * @return ListQpsTimelineResponse
     */
    public ListQpsTimelineResponse listQpsTimeline(ListQpsTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQpsTimelineRequest 请求对象
     * @return SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineInvoker(
        ListQpsTimelineRequest request) {
        return new SyncInvoker<>(request, WafMeta.listQpsTimeline, hcClient);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestTimelineRequest 请求对象
     * @return ListRequestTimelineResponse
     */
    public ListRequestTimelineResponse listRequestTimeline(ListRequestTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestTimelineRequest 请求对象
     * @return SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public SyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineInvoker(
        ListRequestTimelineRequest request) {
        return new SyncInvoker<>(request, WafMeta.listRequestTimeline, hcClient);
    }

    /**
     * 查询安全统计响应码数据
     *
     * 查询安全统计响应码数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponseCodeTimelineRequest 请求对象
     * @return ListResponseCodeTimelineResponse
     */
    public ListResponseCodeTimelineResponse listResponseCodeTimeline(ListResponseCodeTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listResponseCodeTimeline);
    }

    /**
     * 查询安全统计响应码数据
     *
     * 查询安全统计响应码数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponseCodeTimelineRequest 请求对象
     * @return SyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>
     */
    public SyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimelineInvoker(
        ListResponseCodeTimelineRequest request) {
        return new SyncInvoker<>(request, WafMeta.listResponseCodeTimeline, hcClient);
    }

    /**
     * 查询安全报告历史统计周期列表
     *
     * 查询安全报告历史统计周期列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportHistoryPeriodsRequest 请求对象
     * @return ListSecurityReportHistoryPeriodsResponse
     */
    public ListSecurityReportHistoryPeriodsResponse listSecurityReportHistoryPeriods(
        ListSecurityReportHistoryPeriodsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSecurityReportHistoryPeriods);
    }

    /**
     * 查询安全报告历史统计周期列表
     *
     * 查询安全报告历史统计周期列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportHistoryPeriodsRequest 请求对象
     * @return SyncInvoker<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse>
     */
    public SyncInvoker<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse> listSecurityReportHistoryPeriodsInvoker(
        ListSecurityReportHistoryPeriodsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listSecurityReportHistoryPeriods, hcClient);
    }

    /**
     * 查询安全报告发送记录
     *
     * 查询安全报告发送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSendingRecordsRequest 请求对象
     * @return ListSecurityReportSendingRecordsResponse
     */
    public ListSecurityReportSendingRecordsResponse listSecurityReportSendingRecords(
        ListSecurityReportSendingRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSecurityReportSendingRecords);
    }

    /**
     * 查询安全报告发送记录
     *
     * 查询安全报告发送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSendingRecordsRequest 请求对象
     * @return SyncInvoker<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse>
     */
    public SyncInvoker<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse> listSecurityReportSendingRecordsInvoker(
        ListSecurityReportSendingRecordsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listSecurityReportSendingRecords, hcClient);
    }

    /**
     * 查询安全报告订阅列表
     *
     * 查询安全报告订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSubscriptionsRequest 请求对象
     * @return ListSecurityReportSubscriptionsResponse
     */
    public ListSecurityReportSubscriptionsResponse listSecurityReportSubscriptions(
        ListSecurityReportSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listSecurityReportSubscriptions);
    }

    /**
     * 查询安全报告订阅列表
     *
     * 查询安全报告订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSubscriptionsRequest 请求对象
     * @return SyncInvoker<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse>
     */
    public SyncInvoker<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse> listSecurityReportSubscriptionsInvoker(
        ListSecurityReportSubscriptionsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listSecurityReportSubscriptions, hcClient);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listStatistics, hcClient);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常TOP统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopAbnormalRequest 请求对象
     * @return ListTopAbnormalResponse
     */
    public ListTopAbnormalResponse listTopAbnormal(ListTopAbnormalRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常TOP统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopAbnormalRequest 请求对象
     * @return SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalInvoker(
        ListTopAbnormalRequest request) {
        return new SyncInvoker<>(request, WafMeta.listTopAbnormal, hcClient);
    }

    /**
     * 查询top受攻击域名
     *
     * 查询top受攻击域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopDomainsRequest 请求对象
     * @return ListTopDomainsResponse
     */
    public ListTopDomainsResponse listTopDomains(ListTopDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopDomains);
    }

    /**
     * 查询top受攻击域名
     *
     * 查询top受攻击域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopDomainsRequest 请求对象
     * @return SyncInvoker<ListTopDomainsRequest, ListTopDomainsResponse>
     */
    public SyncInvoker<ListTopDomainsRequest, ListTopDomainsResponse> listTopDomainsInvoker(
        ListTopDomainsRequest request) {
        return new SyncInvoker<>(request, WafMeta.listTopDomains, hcClient);
    }

    /**
     * 查询攻击源ip
     *
     * 查询攻击源ip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIpRequest 请求对象
     * @return ListTopIpResponse
     */
    public ListTopIpResponse listTopIp(ListTopIpRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopIp);
    }

    /**
     * 查询攻击源ip
     *
     * 查询攻击源ip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIpRequest 请求对象
     * @return SyncInvoker<ListTopIpRequest, ListTopIpResponse>
     */
    public SyncInvoker<ListTopIpRequest, ListTopIpResponse> listTopIpInvoker(ListTopIpRequest request) {
        return new SyncInvoker<>(request, WafMeta.listTopIp, hcClient);
    }

    /**
     * 查询被攻击url
     *
     * 查询被攻击url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopUrlRequest 请求对象
     * @return ListTopUrlResponse
     */
    public ListTopUrlResponse listTopUrl(ListTopUrlRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopUrl);
    }

    /**
     * 查询被攻击url
     *
     * 查询被攻击url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopUrlRequest 请求对象
     * @return SyncInvoker<ListTopUrlRequest, ListTopUrlResponse>
     */
    public SyncInvoker<ListTopUrlRequest, ListTopUrlResponse> listTopUrlInvoker(ListTopUrlRequest request) {
        return new SyncInvoker<>(request, WafMeta.listTopUrl, hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListValueListRequest 请求对象
     * @return ListValueListResponse
     */
    public ListValueListResponse listValueList(ListValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListValueListRequest 请求对象
     * @return SyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public SyncInvoker<ListValueListRequest, ListValueListResponse> listValueListInvoker(ListValueListRequest request) {
        return new SyncInvoker<>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询web基础防护内置规则列表
     *
     * 查询web基础防护内置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebBasicProtectionRulesRequest 请求对象
     * @return ListWebBasicProtectionRulesResponse
     */
    public ListWebBasicProtectionRulesResponse listWebBasicProtectionRules(ListWebBasicProtectionRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listWebBasicProtectionRules);
    }

    /**
     * 查询web基础防护内置规则列表
     *
     * 查询web基础防护内置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebBasicProtectionRulesRequest 请求对象
     * @return SyncInvoker<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse>
     */
    public SyncInvoker<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse> listWebBasicProtectionRulesInvoker(
        ListWebBasicProtectionRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listWebBasicProtectionRules, hcClient);
    }

    /**
     * 查询所有策略黑白名单防护规则
     *
     * 查询所有策略黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipPolicyRulesRequest 请求对象
     * @return ListWhiteblackipPolicyRulesResponse
     */
    public ListWhiteblackipPolicyRulesResponse listWhiteblackipPolicyRules(ListWhiteblackipPolicyRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listWhiteblackipPolicyRules);
    }

    /**
     * 查询所有策略黑白名单防护规则
     *
     * 查询所有策略黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipPolicyRulesRequest 请求对象
     * @return SyncInvoker<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse>
     */
    public SyncInvoker<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse> listWhiteblackipPolicyRulesInvoker(
        ListWhiteblackipPolicyRulesRequest request) {
        return new SyncInvoker<>(request, WafMeta.listWhiteblackipPolicyRules, hcClient);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipRuleRequest 请求对象
     * @return ListWhiteblackipRuleResponse
     */
    public ListWhiteblackipRuleResponse listWhiteblackipRule(ListWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listWhiteblackipRule);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>
     */
    public SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRuleInvoker(
        ListWhiteblackipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.listWhiteblackipRule, hcClient);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCompositeHostsRequest 请求对象
     * @return MigrateCompositeHostsResponse
     */
    public MigrateCompositeHostsResponse migrateCompositeHosts(MigrateCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.migrateCompositeHosts);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCompositeHostsRequest 请求对象
     * @return SyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>
     */
    public SyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHostsInvoker(
        MigrateCompositeHostsRequest request) {
        return new SyncInvoker<>(request, WafMeta.migrateCompositeHosts, hcClient);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceRequest 请求对象
     * @return RenameInstanceResponse
     */
    public RenameInstanceResponse renameInstance(RenameInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.renameInstance);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceRequest 请求对象
     * @return SyncInvoker<RenameInstanceRequest, RenameInstanceResponse>
     */
    public SyncInvoker<RenameInstanceRequest, RenameInstanceResponse> renameInstanceInvoker(
        RenameInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.renameInstance, hcClient);
    }

    /**
     * 查询JS脚本反爬虫防护规则
     *
     * 根据Id查询JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnticrawlerRuleRequest 请求对象
     * @return ShowAnticrawlerRuleResponse
     */
    public ShowAnticrawlerRuleResponse showAnticrawlerRule(ShowAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showAnticrawlerRule);
    }

    /**
     * 查询JS脚本反爬虫防护规则
     *
     * 根据Id查询JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>
     */
    public SyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRuleInvoker(
        ShowAnticrawlerRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showAnticrawlerRule, hcClient);
    }

    /**
     * 查询防敏感信息泄露防护规则
     *
     * 根据Id查询防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntileakageRuleRequest 请求对象
     * @return ShowAntileakageRuleResponse
     */
    public ShowAntileakageRuleResponse showAntileakageRule(ShowAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showAntileakageRule);
    }

    /**
     * 查询防敏感信息泄露防护规则
     *
     * 根据Id查询防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntileakageRuleRequest 请求对象
     * @return SyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>
     */
    public SyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRuleInvoker(
        ShowAntileakageRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showAntileakageRule, hcClient);
    }

    /**
     * 查询防篡改防护规则
     *
     * 查询防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntitamperRuleRequest 请求对象
     * @return ShowAntitamperRuleResponse
     */
    public ShowAntitamperRuleResponse showAntitamperRule(ShowAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showAntitamperRule);
    }

    /**
     * 查询防篡改防护规则
     *
     * 查询防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntitamperRuleRequest 请求对象
     * @return SyncInvoker<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse>
     */
    public SyncInvoker<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> showAntitamperRuleInvoker(
        ShowAntitamperRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showAntitamperRule, hcClient);
    }

    /**
     * 根据Id查询cc防护规则
     *
     * 根据Id查询cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcRuleRequest 请求对象
     * @return ShowCcRuleResponse
     */
    public ShowCcRuleResponse showCcRule(ShowCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCcRule);
    }

    /**
     * 根据Id查询cc防护规则
     *
     * 根据Id查询cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcRuleRequest 请求对象
     * @return SyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>
     */
    public SyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse> showCcRuleInvoker(ShowCcRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showCcRule, hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<>(request, WafMeta.showCertificate, hcClient);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompositeHostRequest 请求对象
     * @return ShowCompositeHostResponse
     */
    public ShowCompositeHostResponse showCompositeHost(ShowCompositeHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCompositeHost);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompositeHostRequest 请求对象
     * @return SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>
     */
    public SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHostInvoker(
        ShowCompositeHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.showCompositeHost, hcClient);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsoleConfigRequest 请求对象
     * @return ShowConsoleConfigResponse
     */
    public ShowConsoleConfigResponse showConsoleConfig(ShowConsoleConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showConsoleConfig);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsoleConfigRequest 请求对象
     * @return SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>
     */
    public SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfigInvoker(
        ShowConsoleConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.showConsoleConfig, hcClient);
    }

    /**
     * 根据Id查询精准防护规则
     *
     * 根据Id查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomRuleRequest 请求对象
     * @return ShowCustomRuleResponse
     */
    public ShowCustomRuleResponse showCustomRule(ShowCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCustomRule);
    }

    /**
     * 根据Id查询精准防护规则
     *
     * 根据Id查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomRuleRequest 请求对象
     * @return SyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>
     */
    public SyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRuleInvoker(
        ShowCustomRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showCustomRule, hcClient);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 查询地理位置控制防护规则详情
     *
     * 查询地理位置控制防护规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeoipRuleRequest 请求对象
     * @return ShowGeoipRuleResponse
     */
    public ShowGeoipRuleResponse showGeoipRule(ShowGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showGeoipRule);
    }

    /**
     * 查询地理位置控制防护规则详情
     *
     * 查询地理位置控制防护规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeoipRuleRequest 请求对象
     * @return SyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>
     */
    public SyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRuleInvoker(ShowGeoipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showGeoipRule, hcClient);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostRequest 请求对象
     * @return ShowHostResponse
     */
    public ShowHostResponse showHost(ShowHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostRequest 请求对象
     * @return SyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public SyncInvoker<ShowHostRequest, ShowHostResponse> showHostInvoker(ShowHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 查询域名运行状态
     *
     * 查询域名运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostStatusRequest 请求对象
     * @return ShowHostStatusResponse
     */
    public ShowHostStatusResponse showHostStatus(ShowHostStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showHostStatus);
    }

    /**
     * 查询域名运行状态
     *
     * 查询域名运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostStatusRequest 请求对象
     * @return SyncInvoker<ShowHostStatusRequest, ShowHostStatusResponse>
     */
    public SyncInvoker<ShowHostStatusRequest, ShowHostStatusResponse> showHostStatusInvoker(
        ShowHostStatusRequest request) {
        return new SyncInvoker<>(request, WafMeta.showHostStatus, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)防护规则
     *
     * 查询全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIgnoreRuleRequest 请求对象
     * @return ShowIgnoreRuleResponse
     */
    public ShowIgnoreRuleResponse showIgnoreRule(ShowIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)防护规则
     *
     * 查询全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse>
     */
    public SyncInvoker<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> showIgnoreRuleInvoker(
        ShowIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showIgnoreRule, hcClient);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showIpGroup);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<>(request, WafMeta.showIpGroup, hcClient);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsInfoConfigRequest 请求对象
     * @return ShowLtsInfoConfigResponse
     */
    public ShowLtsInfoConfigResponse showLtsInfoConfig(ShowLtsInfoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showLtsInfoConfig);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsInfoConfigRequest 请求对象
     * @return SyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>
     */
    public SyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfigInvoker(
        ShowLtsInfoConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.showLtsInfoConfig, hcClient);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPolicy);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<>(request, WafMeta.showPolicy, hcClient);
    }

    /**
     * 查询地理位置选项的详细信息
     *
     * 查询地理位置选项的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGeoipMapRequest 请求对象
     * @return ShowPolicyGeoipMapResponse
     */
    public ShowPolicyGeoipMapResponse showPolicyGeoipMap(ShowPolicyGeoipMapRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPolicyGeoipMap);
    }

    /**
     * 查询地理位置选项的详细信息
     *
     * 查询地理位置选项的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGeoipMapRequest 请求对象
     * @return SyncInvoker<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse>
     */
    public SyncInvoker<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse> showPolicyGeoipMapInvoker(
        ShowPolicyGeoipMapRequest request) {
        return new SyncInvoker<>(request, WafMeta.showPolicyGeoipMap, hcClient);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPremiumHostRequest 请求对象
     * @return ShowPremiumHostResponse
     */
    public ShowPremiumHostResponse showPremiumHost(ShowPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPremiumHostRequest 请求对象
     * @return SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostInvoker(
        ShowPremiumHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.showPremiumHost, hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivacyRuleRequest 请求对象
     * @return ShowPrivacyRuleResponse
     */
    public ShowPrivacyRuleResponse showPrivacyRule(ShowPrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivacyRuleRequest 请求对象
     * @return SyncInvoker<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse>
     */
    public SyncInvoker<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> showPrivacyRuleInvoker(
        ShowPrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showPrivacyRule, hcClient);
    }

    /**
     * 根据Id查询攻击惩罚防护规则
     *
     * 根据Id查询攻击惩罚防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPunishmentRuleRequest 请求对象
     * @return ShowPunishmentRuleResponse
     */
    public ShowPunishmentRuleResponse showPunishmentRule(ShowPunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPunishmentRule);
    }

    /**
     * 根据Id查询攻击惩罚防护规则
     *
     * 根据Id查询攻击惩罚防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPunishmentRuleRequest 请求对象
     * @return SyncInvoker<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse>
     */
    public SyncInvoker<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> showPunishmentRuleInvoker(
        ShowPunishmentRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showPunishmentRule, hcClient);
    }

    /**
     * 查询安全报告内容
     *
     * 查询安全报告内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportContentRequest 请求对象
     * @return ShowSecurityReportContentResponse
     */
    public ShowSecurityReportContentResponse showSecurityReportContent(ShowSecurityReportContentRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSecurityReportContent);
    }

    /**
     * 查询安全报告内容
     *
     * 查询安全报告内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportContentRequest 请求对象
     * @return SyncInvoker<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse>
     */
    public SyncInvoker<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse> showSecurityReportContentInvoker(
        ShowSecurityReportContentRequest request) {
        return new SyncInvoker<>(request, WafMeta.showSecurityReportContent, hcClient);
    }

    /**
     * 查询安全报告订阅
     *
     * 查询安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportSubscriptionRequest 请求对象
     * @return ShowSecurityReportSubscriptionResponse
     */
    public ShowSecurityReportSubscriptionResponse showSecurityReportSubscription(
        ShowSecurityReportSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSecurityReportSubscription);
    }

    /**
     * 查询安全报告订阅
     *
     * 查询安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportSubscriptionRequest 请求对象
     * @return SyncInvoker<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse>
     */
    public SyncInvoker<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse> showSecurityReportSubscriptionInvoker(
        ShowSecurityReportSubscriptionRequest request) {
        return new SyncInvoker<>(request, WafMeta.showSecurityReportSubscription, hcClient);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceIpRequest 请求对象
     * @return ShowSourceIpResponse
     */
    public ShowSourceIpResponse showSourceIp(ShowSourceIpRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSourceIp);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceIpRequest 请求对象
     * @return SyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>
     */
    public SyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIpInvoker(ShowSourceIpRequest request) {
        return new SyncInvoker<>(request, WafMeta.showSourceIp, hcClient);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionInfoRequest 请求对象
     * @return ShowSubscriptionInfoResponse
     */
    public ShowSubscriptionInfoResponse showSubscriptionInfo(ShowSubscriptionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showSubscriptionInfo);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionInfoRequest 请求对象
     * @return SyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>
     */
    public SyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfoInvoker(
        ShowSubscriptionInfoRequest request) {
        return new SyncInvoker<>(request, WafMeta.showSubscriptionInfo, hcClient);
    }

    /**
     * 查询引用表
     *
     * 查询引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowValueListRequest 请求对象
     * @return ShowValueListResponse
     */
    public ShowValueListResponse showValueList(ShowValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showValueList);
    }

    /**
     * 查询引用表
     *
     * 查询引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowValueListRequest 请求对象
     * @return SyncInvoker<ShowValueListRequest, ShowValueListResponse>
     */
    public SyncInvoker<ShowValueListRequest, ShowValueListResponse> showValueListInvoker(ShowValueListRequest request) {
        return new SyncInvoker<>(request, WafMeta.showValueList, hcClient);
    }

    /**
     * 查询黑白名单防护规则
     *
     * 查询黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhiteBlackIpRuleRequest 请求对象
     * @return ShowWhiteBlackIpRuleResponse
     */
    public ShowWhiteBlackIpRuleResponse showWhiteBlackIpRule(ShowWhiteBlackIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showWhiteBlackIpRule);
    }

    /**
     * 查询黑白名单防护规则
     *
     * 查询黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhiteBlackIpRuleRequest 请求对象
     * @return SyncInvoker<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse>
     */
    public SyncInvoker<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRuleInvoker(
        ShowWhiteBlackIpRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showWhiteBlackIpRule, hcClient);
    }

    /**
     * 修改域名接入进度
     *
     * 返回接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessProgressRequest 请求对象
     * @return UpdateAccessProgressResponse
     */
    public UpdateAccessProgressResponse updateAccessProgress(UpdateAccessProgressRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAccessProgress);
    }

    /**
     * 修改域名接入进度
     *
     * 返回接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessProgressRequest 请求对象
     * @return SyncInvoker<UpdateAccessProgressRequest, UpdateAccessProgressResponse>
     */
    public SyncInvoker<UpdateAccessProgressRequest, UpdateAccessProgressResponse> updateAccessProgressInvoker(
        UpdateAccessProgressRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAccessProgress, hcClient);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertNoticeConfigRequest 请求对象
     * @return UpdateAlertNoticeConfigResponse
     */
    public UpdateAlertNoticeConfigResponse updateAlertNoticeConfig(UpdateAlertNoticeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAlertNoticeConfig);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertNoticeConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>
     */
    public SyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigInvoker(
        UpdateAlertNoticeConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAlertNoticeConfig, hcClient);
    }

    /**
     * 网页防篡改规则更新缓存
     *
     * 网页防篡改规则更新缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiTamperRuleRefreshRequest 请求对象
     * @return UpdateAntiTamperRuleRefreshResponse
     */
    public UpdateAntiTamperRuleRefreshResponse updateAntiTamperRuleRefresh(UpdateAntiTamperRuleRefreshRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAntiTamperRuleRefresh);
    }

    /**
     * 网页防篡改规则更新缓存
     *
     * 网页防篡改规则更新缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiTamperRuleRefreshRequest 请求对象
     * @return SyncInvoker<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse>
     */
    public SyncInvoker<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefreshInvoker(
        UpdateAntiTamperRuleRefreshRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAntiTamperRuleRefresh, hcClient);
    }

    /**
     * 更新JS脚本反爬虫防护规则
     *
     * 更新JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleRequest 请求对象
     * @return UpdateAnticrawlerRuleResponse
     */
    public UpdateAnticrawlerRuleResponse updateAnticrawlerRule(UpdateAnticrawlerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAnticrawlerRule);
    }

    /**
     * 更新JS脚本反爬虫防护规则
     *
     * 更新JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleRequest 请求对象
     * @return SyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>
     */
    public SyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleInvoker(
        UpdateAnticrawlerRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAnticrawlerRule, hcClient);
    }

    /**
     * 更新JS脚本反爬虫规则防护模式
     *
     * 更新JS脚本反爬虫规则防护模式，在创建JS脚本反爬虫规则前，需要调用该接口指定JS脚本反爬虫规则防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleTypeRequest 请求对象
     * @return UpdateAnticrawlerRuleTypeResponse
     */
    public UpdateAnticrawlerRuleTypeResponse updateAnticrawlerRuleType(UpdateAnticrawlerRuleTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAnticrawlerRuleType);
    }

    /**
     * 更新JS脚本反爬虫规则防护模式
     *
     * 更新JS脚本反爬虫规则防护模式，在创建JS脚本反爬虫规则前，需要调用该接口指定JS脚本反爬虫规则防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleTypeRequest 请求对象
     * @return SyncInvoker<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse>
     */
    public SyncInvoker<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleTypeInvoker(
        UpdateAnticrawlerRuleTypeRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAnticrawlerRuleType, hcClient);
    }

    /**
     * 更新防敏感信息泄露防护规则
     *
     * 更新防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntileakageRuleRequest 请求对象
     * @return UpdateAntileakageRuleResponse
     */
    public UpdateAntileakageRuleResponse updateAntileakageRule(UpdateAntileakageRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateAntileakageRule);
    }

    /**
     * 更新防敏感信息泄露防护规则
     *
     * 更新防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntileakageRuleRequest 请求对象
     * @return SyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>
     */
    public SyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRuleInvoker(
        UpdateAntileakageRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateAntileakageRule, hcClient);
    }

    /**
     * 更新cc防护规则
     *
     * 更新cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCcRuleRequest 请求对象
     * @return UpdateCcRuleResponse
     */
    public UpdateCcRuleResponse updateCcRule(UpdateCcRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCcRule);
    }

    /**
     * 更新cc防护规则
     *
     * 更新cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCcRuleRequest 请求对象
     * @return SyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>
     */
    public SyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRuleInvoker(UpdateCcRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateCcRule, hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateCertificate, hcClient);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomRuleRequest 请求对象
     * @return UpdateCustomRuleResponse
     */
    public UpdateCustomRuleResponse updateCustomRule(UpdateCustomRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCustomRule);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomRuleRequest 请求对象
     * @return SyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>
     */
    public SyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRuleInvoker(
        UpdateCustomRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateCustomRule, hcClient);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoipRuleRequest 请求对象
     * @return UpdateGeoipRuleResponse
     */
    public UpdateGeoipRuleResponse updateGeoipRule(UpdateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoipRuleRequest 请求对象
     * @return SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleInvoker(
        UpdateGeoipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateGeoipRule, hcClient);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostRequest 请求对象
     * @return UpdateHostResponse
     */
    public UpdateHostResponse updateHost(UpdateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostRequest 请求对象
     * @return SyncInvoker<UpdateHostRequest, UpdateHostResponse>
     */
    public SyncInvoker<UpdateHostRequest, UpdateHostResponse> updateHostInvoker(UpdateHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateHost, hcClient);
    }

    /**
     * 修改域名接入状态
     *
     * 返回接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostAccessStatusOfUnderlineRequest 请求对象
     * @return UpdateHostAccessStatusOfUnderlineResponse
     */
    public UpdateHostAccessStatusOfUnderlineResponse updateHostAccessStatusOfUnderline(
        UpdateHostAccessStatusOfUnderlineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHostAccessStatusOfUnderline);
    }

    /**
     * 修改域名接入状态
     *
     * 返回接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostAccessStatusOfUnderlineRequest 请求对象
     * @return SyncInvoker<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse>
     */
    public SyncInvoker<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse> updateHostAccessStatusOfUnderlineInvoker(
        UpdateHostAccessStatusOfUnderlineRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateHostAccessStatusOfUnderline, hcClient);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostProtectStatusRequest 请求对象
     * @return UpdateHostProtectStatusResponse
     */
    public UpdateHostProtectStatusResponse updateHostProtectStatus(UpdateHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHostProtectStatus);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>
     */
    public SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatusInvoker(
        UpdateHostProtectStatusRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateHostProtectStatus, hcClient);
    }

    /**
     * 更新全局白名单(原误报屏蔽)防护规则
     *
     * 更新全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnoreRuleRequest 请求对象
     * @return UpdateIgnoreRuleResponse
     */
    public UpdateIgnoreRuleResponse updateIgnoreRule(UpdateIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateIgnoreRule);
    }

    /**
     * 更新全局白名单(原误报屏蔽)防护规则
     *
     * 更新全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnoreRuleRequest 请求对象
     * @return SyncInvoker<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse>
     */
    public SyncInvoker<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> updateIgnoreRuleInvoker(
        UpdateIgnoreRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateIgnoreRule, hcClient);
    }

    /**
     * 修改云模式域名路由信息
     *
     * 更新云模式域名路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRouteRequest 请求对象
     * @return UpdateInstanceRouteResponse
     */
    public UpdateInstanceRouteResponse updateInstanceRoute(UpdateInstanceRouteRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateInstanceRoute);
    }

    /**
     * 修改云模式域名路由信息
     *
     * 更新云模式域名路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRouteRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse>
     */
    public SyncInvoker<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse> updateInstanceRouteInvoker(
        UpdateInstanceRouteRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateInstanceRoute, hcClient);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateIpGroup);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateIpGroup, hcClient);
    }

    /**
     * 更新机房IP情报防护规则
     *
     * 更新IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpReputationRuleRequest 请求对象
     * @return UpdateIpReputationRuleResponse
     */
    public UpdateIpReputationRuleResponse updateIpReputationRule(UpdateIpReputationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateIpReputationRule);
    }

    /**
     * 更新机房IP情报防护规则
     *
     * 更新IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpReputationRuleRequest 请求对象
     * @return SyncInvoker<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse>
     */
    public SyncInvoker<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse> updateIpReputationRuleInvoker(
        UpdateIpReputationRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateIpReputationRule, hcClient);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsInfoConfigRequest 请求对象
     * @return UpdateLtsInfoConfigResponse
     */
    public UpdateLtsInfoConfigResponse updateLtsInfoConfig(UpdateLtsInfoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateLtsInfoConfig);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsInfoConfigRequest 请求对象
     * @return SyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>
     */
    public SyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfigInvoker(
        UpdateLtsInfoConfigRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateLtsInfoConfig, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePolicy, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyProtectHostRequest 请求对象
     * @return UpdatePolicyProtectHostResponse
     */
    public UpdatePolicyProtectHostResponse updatePolicyProtectHost(UpdatePolicyProtectHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyProtectHost);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyProtectHostRequest 请求对象
     * @return SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>
     */
    public SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHostInvoker(
        UpdatePolicyProtectHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePolicyProtectHost, hcClient);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRuleStatusRequest 请求对象
     * @return UpdatePolicyRuleStatusResponse
     */
    public UpdatePolicyRuleStatusResponse updatePolicyRuleStatus(UpdatePolicyRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyRuleStatus);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>
     */
    public SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusInvoker(
        UpdatePolicyRuleStatusRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePolicyRuleStatus, hcClient);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostRequest 请求对象
     * @return UpdatePremiumHostResponse
     */
    public UpdatePremiumHostResponse updatePremiumHost(UpdatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostInvoker(
        UpdatePremiumHostRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePremiumHost, hcClient);
    }

    /**
     * 修改独享模式域名接入状态
     *
     * 修改独享模式域名接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostAccessStatusRequest 请求对象
     * @return UpdatePremiumHostAccessStatusResponse
     */
    public UpdatePremiumHostAccessStatusResponse updatePremiumHostAccessStatus(
        UpdatePremiumHostAccessStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostAccessStatus);
    }

    /**
     * 修改独享模式域名接入状态
     *
     * 修改独享模式域名接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostAccessStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusInvoker(
        UpdatePremiumHostAccessStatusRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePremiumHostAccessStatus, hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostProtectStatusRequest 请求对象
     * @return UpdatePremiumHostProtectStatusResponse
     */
    public UpdatePremiumHostProtectStatusResponse updatePremiumHostProtectStatus(
        UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusInvoker(
        UpdatePremiumHostProtectStatusRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 操作WAF独享引擎
     *
     * 操作WAF独享引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceRequest 请求对象
     * @return UpdatePremiumInstanceResponse
     */
    public UpdatePremiumInstanceResponse updatePremiumInstance(UpdatePremiumInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumInstance);
    }

    /**
     * 操作WAF独享引擎
     *
     * 操作WAF独享引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceRequest 请求对象
     * @return SyncInvoker<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse>
     */
    public SyncInvoker<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse> updatePremiumInstanceInvoker(
        UpdatePremiumInstanceRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePremiumInstance, hcClient);
    }

    /**
     * 修改独享域名接入进度
     *
     * 返回独享接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceProgressRequest 请求对象
     * @return UpdatePremiumInstanceProgressResponse
     */
    public UpdatePremiumInstanceProgressResponse updatePremiumInstanceProgress(
        UpdatePremiumInstanceProgressRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumInstanceProgress);
    }

    /**
     * 修改独享域名接入进度
     *
     * 返回独享接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceProgressRequest 请求对象
     * @return SyncInvoker<UpdatePremiumInstanceProgressRequest, UpdatePremiumInstanceProgressResponse>
     */
    public SyncInvoker<UpdatePremiumInstanceProgressRequest, UpdatePremiumInstanceProgressResponse> updatePremiumInstanceProgressInvoker(
        UpdatePremiumInstanceProgressRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePremiumInstanceProgress, hcClient);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyRuleRequest 请求对象
     * @return UpdatePrivacyRuleResponse
     */
    public UpdatePrivacyRuleResponse updatePrivacyRule(UpdatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePrivacyRule);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>
     */
    public SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRuleInvoker(
        UpdatePrivacyRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePrivacyRule, hcClient);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePunishmentRuleRequest 请求对象
     * @return UpdatePunishmentRuleResponse
     */
    public UpdatePunishmentRuleResponse updatePunishmentRule(UpdatePunishmentRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePunishmentRule);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePunishmentRuleRequest 请求对象
     * @return SyncInvoker<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse>
     */
    public SyncInvoker<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> updatePunishmentRuleInvoker(
        UpdatePunishmentRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updatePunishmentRule, hcClient);
    }

    /**
     * 修改安全报告的订阅
     *
     * 修改安全报告的订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityReportSubscriptionRequest 请求对象
     * @return UpdateSecurityReportSubscriptionResponse
     */
    public UpdateSecurityReportSubscriptionResponse updateSecurityReportSubscription(
        UpdateSecurityReportSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateSecurityReportSubscription);
    }

    /**
     * 修改安全报告的订阅
     *
     * 修改安全报告的订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityReportSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateSecurityReportSubscriptionRequest, UpdateSecurityReportSubscriptionResponse>
     */
    public SyncInvoker<UpdateSecurityReportSubscriptionRequest, UpdateSecurityReportSubscriptionResponse> updateSecurityReportSubscriptionInvoker(
        UpdateSecurityReportSubscriptionRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateSecurityReportSubscription, hcClient);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateValueListRequest 请求对象
     * @return UpdateValueListResponse
     */
    public UpdateValueListResponse updateValueList(UpdateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateValueList);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateValueListRequest 请求对象
     * @return SyncInvoker<UpdateValueListRequest, UpdateValueListResponse>
     */
    public SyncInvoker<UpdateValueListRequest, UpdateValueListResponse> updateValueListInvoker(
        UpdateValueListRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateValueList, hcClient);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWhiteblackipRuleRequest 请求对象
     * @return UpdateWhiteblackipRuleResponse
     */
    public UpdateWhiteblackipRuleResponse updateWhiteblackipRule(UpdateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateWhiteblackipRule);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>
     */
    public SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleInvoker(
        UpdateWhiteblackipRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.updateWhiteblackipRule, hcClient);
    }

    /**
     * 查询用户托管在云解析上的域名
     *
     * 查询用户托管在云解析上的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmDnsDomainRequest 请求对象
     * @return ConfirmDnsDomainResponse
     */
    public ConfirmDnsDomainResponse confirmDnsDomain(ConfirmDnsDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.confirmDnsDomain);
    }

    /**
     * 查询用户托管在云解析上的域名
     *
     * 查询用户托管在云解析上的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmDnsDomainRequest 请求对象
     * @return SyncInvoker<ConfirmDnsDomainRequest, ConfirmDnsDomainResponse>
     */
    public SyncInvoker<ConfirmDnsDomainRequest, ConfirmDnsDomainResponse> confirmDnsDomainInvoker(
        ConfirmDnsDomainRequest request) {
        return new SyncInvoker<>(request, WafMeta.confirmDnsDomain, hcClient);
    }

    /**
     * 域名快速接入WAF
     *
     * 快速接入，直接去修改用户的DNS记录，使域名快速接入WAF
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuickAccessDomainRequest 请求对象
     * @return CreateQuickAccessDomainResponse
     */
    public CreateQuickAccessDomainResponse createQuickAccessDomain(CreateQuickAccessDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createQuickAccessDomain);
    }

    /**
     * 域名快速接入WAF
     *
     * 快速接入，直接去修改用户的DNS记录，使域名快速接入WAF
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuickAccessDomainRequest 请求对象
     * @return SyncInvoker<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse>
     */
    public SyncInvoker<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse> createQuickAccessDomainInvoker(
        CreateQuickAccessDomainRequest request) {
        return new SyncInvoker<>(request, WafMeta.createQuickAccessDomain, hcClient);
    }

    /**
     * 根据Id查询Web防护规则
     *
     * 根据Id查询Web防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebProtectionRuleRequest 请求对象
     * @return ShowWebProtectionRuleResponse
     */
    public ShowWebProtectionRuleResponse showWebProtectionRule(ShowWebProtectionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showWebProtectionRule);
    }

    /**
     * 根据Id查询Web防护规则
     *
     * 根据Id查询Web防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebProtectionRuleRequest 请求对象
     * @return SyncInvoker<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse>
     */
    public SyncInvoker<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse> showWebProtectionRuleInvoker(
        ShowWebProtectionRuleRequest request) {
        return new SyncInvoker<>(request, WafMeta.showWebProtectionRule, hcClient);
    }

}
