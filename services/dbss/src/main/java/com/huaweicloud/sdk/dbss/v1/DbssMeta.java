package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.AgentEditRequest;
import com.huaweicloud.sdk.dbss.v1.model.AgentSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.AlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.AuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AuditScopeRequestNew;
import com.huaweicloud.sdk.dbss.v1.model.AuditScopeSwitchRequestNew;
import com.huaweicloud.sdk.dbss.v1.model.AuditSqlRequest;
import com.huaweicloud.sdk.dbss.v1.model.AuditSummaryStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.BackupPageRequest;
import com.huaweicloud.sdk.dbss.v1.model.BackupSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteAuditScopeRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteAuditScopeResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchSetAuditAlarmLogStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchSetAuditAlarmLogStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchSwitchesRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchSwitchesRequestNew;
import com.huaweicloud.sdk.dbss.v1.model.BindDbEncryptEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.BindDbEncryptEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.BindDbOmEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.BindDbOmEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.BindEIPRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbEncryptSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbEncryptSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbOmSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbOmSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.ChangeNameRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangePasswordRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChargeOrderDbssNew;
import com.huaweicloud.sdk.dbss.v1.model.ConfigAlarmTopicRequest;
import com.huaweicloud.sdk.dbss.v1.model.ConfigReportTopicRequest;
import com.huaweicloud.sdk.dbss.v1.model.ConfirmUpgradeAuditRequest;
import com.huaweicloud.sdk.dbss.v1.model.ConfirmUpgradeAuditResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountDbAccountSessionRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountDbAccountSessionResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountDbClientSessionRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountDbClientSessionResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountInjectionStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountInjectionStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountOperationStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountOperationStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountRiskTrendStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountRiskTrendStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSessionStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSessionStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlTrendStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlTrendStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditDbAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditDbAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditScopeRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditScopeRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditSqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditSqlRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbEncryptInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbEncryptInstancePeriodResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbOmInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbOmInstancePeriodResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateReportRequestBody;
import com.huaweicloud.sdk.dbss.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateSensitiveMaskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateSensitiveMaskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditBackupTaskRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditBackupTaskResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleSqlRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleSqlResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditScopeRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditScopeResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstanceDemandRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteSensitiveRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteSensitiveRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.GeneralRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupRiskTemplatesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupRiskTemplatesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditObsBucketsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditObsBucketsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportTemplatesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportTemplatesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTrendHistoryRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTrendHistoryResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListDbEncryptInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListDbEncryptInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListWhitelistsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListWhitelistsResponse;
import com.huaweicloud.sdk.dbss.v1.model.MarkAlarmLog;
import com.huaweicloud.sdk.dbss.v1.model.MaskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.MonitorInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.OperateLogGetRequest;
import com.huaweicloud.sdk.dbss.v1.model.RankRiskRuleNew;
import com.huaweicloud.sdk.dbss.v1.model.RdsDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.RdsNoAgentDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.ReportAccountSessionNew;
import com.huaweicloud.sdk.dbss.v1.model.ReportClientSessionNew;
import com.huaweicloud.sdk.dbss.v1.model.ReportGetReportsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbEncryptPasswordRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbEncryptPasswordResponse;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbOmPasswordRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbOmPasswordResponse;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagDeleteRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.RestoreAuditBackupRequest;
import com.huaweicloud.sdk.dbss.v1.model.RestoreAuditBackupResponse;
import com.huaweicloud.sdk.dbss.v1.model.RetryAuditBackupTaskRequest;
import com.huaweicloud.sdk.dbss.v1.model.RetryAuditBackupTaskResponse;
import com.huaweicloud.sdk.dbss.v1.model.RiskBackupConfig;
import com.huaweicloud.sdk.dbss.v1.model.RiskBackupTemplate;
import com.huaweicloud.sdk.dbss.v1.model.RuleAddRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.RuleAddSqlRequest;
import com.huaweicloud.sdk.dbss.v1.model.RuleScopeRequest;
import com.huaweicloud.sdk.dbss.v1.model.RuleSqlIdRequest;
import com.huaweicloud.sdk.dbss.v1.model.RuleSqlIdsRequestNew;
import com.huaweicloud.sdk.dbss.v1.model.SecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ServerIdBean;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAlarmLogStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAlarmLogStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAutoBackupTemplateRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAutoBackupTemplateResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupRiskSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupRiskSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditInstanceTimeZoneRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditInstanceTimeZoneResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditScopeRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditScopeRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditSqlRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditSqlRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskOperationPolicyRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskOperationPolicyResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskRuleRankRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskRuleRankResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveMaskRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveMaskRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveResultSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveResultSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSqlRuleRankRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSqlRuleRankResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackRiskTemplateRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackRiskTemplateResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackupStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackupStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTaskStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTaskStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTopicReportSchedulerConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTopicReportSchedulerConfigResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditUpgradeStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditUpgradeStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowBackupRiskBucketPathRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowBackupRiskBucketPathResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceMonitorInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceMonitorInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveMaskSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveMaskSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveResultSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveResultSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowServerVersionRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowServerVersionResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSqlDetailRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSqlDetailResponse;
import com.huaweicloud.sdk.dbss.v1.model.SqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SqlSessionStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchStatus;
import com.huaweicloud.sdk.dbss.v1.model.TimezoneRequest;
import com.huaweicloud.sdk.dbss.v1.model.TrendStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbEncryptEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbEncryptEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbOmEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbOmEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditBean;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditRiskBucketPathRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditRiskBucketPathResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditScopeRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditScopeRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSqlRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTaskStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTaskStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTopicReportSchedulerConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTopicReportSchedulerConfigResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbEncryptInstanceNameRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbEncryptInstanceNameResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbOmInstanceNameRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbOmInstanceNameResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateSensitiveMaskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateSensitiveMaskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.UploadAuditDbConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.UploadAuditDbConfigResponse;
import com.huaweicloud.sdk.dbss.v1.model.WhitelistBatchDeleteRequest;

import java.util.List;

@SuppressWarnings("unchecked")
public class DbssMeta {

    public static final HttpRequestDef<AddAuditAgentRequest, AddAuditAgentResponse> addAuditAgent =
        genForAddAuditAgent();

    private static HttpRequestDef<AddAuditAgentRequest, AddAuditAgentResponse> genForAddAuditAgent() {
        // basic
        HttpRequestDef.Builder<AddAuditAgentRequest, AddAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditAgentRequest.class, AddAuditAgentResponse.class)
                .withName("AddAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditAgentRequest::getInstanceId, AddAuditAgentRequest::setInstanceId));
        builder.<AuditAgentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditAgentRequest.class),
            f -> f.withMarshaller(AddAuditAgentRequest::getBody, AddAuditAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAuditDatabaseRequest, AddAuditDatabaseResponse> addAuditDatabase =
        genForAddAuditDatabase();

    private static HttpRequestDef<AddAuditDatabaseRequest, AddAuditDatabaseResponse> genForAddAuditDatabase() {
        // basic
        HttpRequestDef.Builder<AddAuditDatabaseRequest, AddAuditDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditDatabaseRequest.class, AddAuditDatabaseResponse.class)
                .withName("AddAuditDatabase")
                .withUri("/v1/{project_id}/{instance_id}/audit/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditDatabaseRequest::getInstanceId, AddAuditDatabaseRequest::setInstanceId));
        builder.<CreateDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseRequest.class),
            f -> f.withMarshaller(AddAuditDatabaseRequest::getBody, AddAuditDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse> addAuditDatabaseNew =
        genForAddAuditDatabaseNew();

    private static HttpRequestDef<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse> genForAddAuditDatabaseNew() {
        // basic
        HttpRequestDef.Builder<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditDatabaseNewRequest.class, AddAuditDatabaseNewResponse.class)
                .withName("AddAuditDatabaseNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditDatabaseNewRequest::getInstanceId,
                AddAuditDatabaseNewRequest::setInstanceId));
        builder.<CreateDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseRequest.class),
            f -> f.withMarshaller(AddAuditDatabaseNewRequest::getBody, AddAuditDatabaseNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRdsDatabaseRequest, AddRdsDatabaseResponse> addRdsDatabase =
        genForAddRdsDatabase();

    private static HttpRequestDef<AddRdsDatabaseRequest, AddRdsDatabaseResponse> genForAddRdsDatabase() {
        // basic
        HttpRequestDef.Builder<AddRdsDatabaseRequest, AddRdsDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRdsDatabaseRequest.class, AddRdsDatabaseResponse.class)
                .withName("AddRdsDatabase")
                .withUri("/v2/{project_id}/{instance_id}/audit/databases/rds")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRdsDatabaseRequest::getInstanceId, AddRdsDatabaseRequest::setInstanceId));
        builder.<RdsDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RdsDbRequest.class),
            f -> f.withMarshaller(AddRdsDatabaseRequest::getBody, AddRdsDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse> addRdsDatabaseNew =
        genForAddRdsDatabaseNew();

    private static HttpRequestDef<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse> genForAddRdsDatabaseNew() {
        // basic
        HttpRequestDef.Builder<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRdsDatabaseNewRequest.class, AddRdsDatabaseNewResponse.class)
                .withName("AddRdsDatabaseNew")
                .withUri("/v3/{project_id}/audit/{instance_id}/databases/rds")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRdsDatabaseNewRequest::getInstanceId, AddRdsDatabaseNewRequest::setInstanceId));
        builder.<RdsDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RdsDbRequest.class),
            f -> f.withMarshaller(AddRdsDatabaseNewRequest::getBody, AddRdsDatabaseNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabase =
        genForAddRdsNoAgentDatabase();

    private static HttpRequestDef<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> genForAddRdsNoAgentDatabase() {
        // basic
        HttpRequestDef.Builder<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddRdsNoAgentDatabaseRequest.class, AddRdsNoAgentDatabaseResponse.class)
            .withName("AddRdsNoAgentDatabase")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/databases/rds")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRdsNoAgentDatabaseRequest::getInstanceId,
                AddRdsNoAgentDatabaseRequest::setInstanceId));
        builder.<RdsNoAgentDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RdsNoAgentDbRequest.class),
            f -> f.withMarshaller(AddRdsNoAgentDatabaseRequest::getBody, AddRdsNoAgentDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse> batchDeleteAuditScope =
        genForBatchDeleteAuditScope();

    private static HttpRequestDef<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse> genForBatchDeleteAuditScope() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteAuditScopeRequest.class, BatchDeleteAuditScopeResponse.class)
            .withName("BatchDeleteAuditScope")
            .withUri("/v1/{project_id}/audit/{instance_id}/rule/scopes/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAuditScopeRequest::getInstanceId,
                BatchDeleteAuditScopeRequest::setInstanceId));
        builder.<AuditScopeRequestNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditScopeRequestNew.class),
            f -> f.withMarshaller(BatchDeleteAuditScopeRequest::getBody, BatchDeleteAuditScopeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse> batchSetAuditAlarmLogStatus =
        genForBatchSetAuditAlarmLogStatus();

    private static HttpRequestDef<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse> genForBatchSetAuditAlarmLogStatus() {
        // basic
        HttpRequestDef.Builder<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchSetAuditAlarmLogStatusRequest.class,
                    BatchSetAuditAlarmLogStatusResponse.class)
                .withName("BatchSetAuditAlarmLogStatus")
                .withUri("/v1/{project_id}/audit/{instance_id}/alarm-log/mark")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSetAuditAlarmLogStatusRequest::getInstanceId,
                BatchSetAuditAlarmLogStatusRequest::setInstanceId));
        builder.<MarkAlarmLog>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MarkAlarmLog.class),
            f -> f.withMarshaller(BatchSetAuditAlarmLogStatusRequest::getBody,
                BatchSetAuditAlarmLogStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BindDbEncryptEipRequest, BindDbEncryptEipResponse> bindDbEncryptEip =
        genForBindDbEncryptEip();

    private static HttpRequestDef<BindDbEncryptEipRequest, BindDbEncryptEipResponse> genForBindDbEncryptEip() {
        // basic
        HttpRequestDef.Builder<BindDbEncryptEipRequest, BindDbEncryptEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindDbEncryptEipRequest.class, BindDbEncryptEipResponse.class)
                .withName("BindDbEncryptEip")
                .withUri("/v1/{project_id}/db-encrypt/{instance_id}/eip/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindDbEncryptEipRequest::getInstanceId, BindDbEncryptEipRequest::setInstanceId));
        builder.<BindEIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEIPRequest.class),
            f -> f.withMarshaller(BindDbEncryptEipRequest::getBody, BindDbEncryptEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BindDbOmEipRequest, BindDbOmEipResponse> bindDbOmEip = genForBindDbOmEip();

    private static HttpRequestDef<BindDbOmEipRequest, BindDbOmEipResponse> genForBindDbOmEip() {
        // basic
        HttpRequestDef.Builder<BindDbOmEipRequest, BindDbOmEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindDbOmEipRequest.class, BindDbOmEipResponse.class)
                .withName("BindDbOmEip")
                .withUri("/v1/{project_id}/db-om/{instance_id}/eip/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindDbOmEipRequest::getInstanceId, BindDbOmEipRequest::setInstanceId));
        builder.<BindEIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEIPRequest.class),
            f -> f.withMarshaller(BindDbOmEipRequest::getBody, BindDbOmEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse> changeDbEncryptSecurityGroup =
        genForChangeDbEncryptSecurityGroup();

    private static HttpRequestDef<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse> genForChangeDbEncryptSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeDbEncryptSecurityGroupRequest.class,
                    ChangeDbEncryptSecurityGroupResponse.class)
                .withName("ChangeDbEncryptSecurityGroup")
                .withUri("/v1/{project_id}/db-encrypt/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDbEncryptSecurityGroupRequest::getInstanceId,
                ChangeDbEncryptSecurityGroupRequest::setInstanceId));
        builder.<ChangeSecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupRequest.class),
            f -> f.withMarshaller(ChangeDbEncryptSecurityGroupRequest::getBody,
                ChangeDbEncryptSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse> changeDbOmSecurityGroup =
        genForChangeDbOmSecurityGroup();

    private static HttpRequestDef<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse> genForChangeDbOmSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeDbOmSecurityGroupRequest.class, ChangeDbOmSecurityGroupResponse.class)
            .withName("ChangeDbOmSecurityGroup")
            .withUri("/v1/{project_id}/db-om/{instance_id}/security-group")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDbOmSecurityGroupRequest::getInstanceId,
                ChangeDbOmSecurityGroupRequest::setInstanceId));
        builder.<ChangeSecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupRequest.class),
            f -> f.withMarshaller(ChangeDbOmSecurityGroupRequest::getBody, ChangeDbOmSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse> confirmUpgradeAudit =
        genForConfirmUpgradeAudit();

    private static HttpRequestDef<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse> genForConfirmUpgradeAudit() {
        // basic
        HttpRequestDef.Builder<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmUpgradeAuditRequest.class, ConfirmUpgradeAuditResponse.class)
                .withName("ConfirmUpgradeAudit")
                .withUri("/v1/{project_id}/audit/{resource_id}/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmUpgradeAuditRequest::getResourceId,
                ConfirmUpgradeAuditRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountDbAccountSessionRequest, CountDbAccountSessionResponse> countDbAccountSession =
        genForCountDbAccountSession();

    private static HttpRequestDef<CountDbAccountSessionRequest, CountDbAccountSessionResponse> genForCountDbAccountSession() {
        // basic
        HttpRequestDef.Builder<CountDbAccountSessionRequest, CountDbAccountSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountDbAccountSessionRequest.class, CountDbAccountSessionResponse.class)
            .withName("CountDbAccountSession")
            .withUri("/v1/{project_id}/audit/{instance_id}/statistics/session/db-account")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountDbAccountSessionRequest::getInstanceId,
                CountDbAccountSessionRequest::setInstanceId));
        builder.<SqlSessionStatisticsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlSessionStatisticsRequest.class),
            f -> f.withMarshaller(CountDbAccountSessionRequest::getBody, CountDbAccountSessionRequest::setBody));

        // response
        builder.<List<ReportAccountSessionNew>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountDbAccountSessionResponse::getBody, CountDbAccountSessionResponse::setBody)
                .withInnerContainerType(ReportAccountSessionNew.class));

        return builder.build();
    }

    public static final HttpRequestDef<CountDbClientSessionRequest, CountDbClientSessionResponse> countDbClientSession =
        genForCountDbClientSession();

    private static HttpRequestDef<CountDbClientSessionRequest, CountDbClientSessionResponse> genForCountDbClientSession() {
        // basic
        HttpRequestDef.Builder<CountDbClientSessionRequest, CountDbClientSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountDbClientSessionRequest.class, CountDbClientSessionResponse.class)
            .withName("CountDbClientSession")
            .withUri("/v1/{project_id}/audit/{instance_id}/statistics/session/db-client")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountDbClientSessionRequest::getInstanceId,
                CountDbClientSessionRequest::setInstanceId));
        builder.<SqlSessionStatisticsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlSessionStatisticsRequest.class),
            f -> f.withMarshaller(CountDbClientSessionRequest::getBody, CountDbClientSessionRequest::setBody));

        // response
        builder.<List<ReportClientSessionNew>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountDbClientSessionResponse::getBody, CountDbClientSessionResponse::setBody)
                .withInnerContainerType(ReportClientSessionNew.class));

        return builder.build();
    }

    public static final HttpRequestDef<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse> countInjectionStatistics =
        genForCountInjectionStatistics();

    private static HttpRequestDef<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse> genForCountInjectionStatistics() {
        // basic
        HttpRequestDef.Builder<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountInjectionStatisticsRequest.class, CountInjectionStatisticsResponse.class)
                .withName("CountInjectionStatistics")
                .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/sql-injection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountInjectionStatisticsRequest::getInstanceId,
                CountInjectionStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountInjectionStatisticsRequest::getBody, CountInjectionStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountOperationStatisticsRequest, CountOperationStatisticsResponse> countOperationStatistics =
        genForCountOperationStatistics();

    private static HttpRequestDef<CountOperationStatisticsRequest, CountOperationStatisticsResponse> genForCountOperationStatistics() {
        // basic
        HttpRequestDef.Builder<CountOperationStatisticsRequest, CountOperationStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountOperationStatisticsRequest.class, CountOperationStatisticsResponse.class)
                .withName("CountOperationStatistics")
                .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/risk-operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountOperationStatisticsRequest::getInstanceId,
                CountOperationStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountOperationStatisticsRequest::getBody, CountOperationStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse> countRiskTrendStatistics =
        genForCountRiskTrendStatistics();

    private static HttpRequestDef<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse> genForCountRiskTrendStatistics() {
        // basic
        HttpRequestDef.Builder<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountRiskTrendStatisticsRequest.class, CountRiskTrendStatisticsResponse.class)
                .withName("CountRiskTrendStatistics")
                .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/risk-level")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountRiskTrendStatisticsRequest::getInstanceId,
                CountRiskTrendStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountRiskTrendStatisticsRequest::getBody, CountRiskTrendStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSessionStatisticsRequest, CountSessionStatisticsResponse> countSessionStatistics =
        genForCountSessionStatistics();

    private static HttpRequestDef<CountSessionStatisticsRequest, CountSessionStatisticsResponse> genForCountSessionStatistics() {
        // basic
        HttpRequestDef.Builder<CountSessionStatisticsRequest, CountSessionStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountSessionStatisticsRequest.class, CountSessionStatisticsResponse.class)
            .withName("CountSessionStatistics")
            .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/session")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSessionStatisticsRequest::getInstanceId,
                CountSessionStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountSessionStatisticsRequest::getBody, CountSessionStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSqlStatisticsRequest, CountSqlStatisticsResponse> countSqlStatistics =
        genForCountSqlStatistics();

    private static HttpRequestDef<CountSqlStatisticsRequest, CountSqlStatisticsResponse> genForCountSqlStatistics() {
        // basic
        HttpRequestDef.Builder<CountSqlStatisticsRequest, CountSqlStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountSqlStatisticsRequest.class, CountSqlStatisticsResponse.class)
                .withName("CountSqlStatistics")
                .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/sql-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSqlStatisticsRequest::getInstanceId, CountSqlStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountSqlStatisticsRequest::getBody, CountSqlStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse> countSqlTrendStatistics =
        genForCountSqlTrendStatistics();

    private static HttpRequestDef<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse> genForCountSqlTrendStatistics() {
        // basic
        HttpRequestDef.Builder<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountSqlTrendStatisticsRequest.class, CountSqlTrendStatisticsResponse.class)
            .withName("CountSqlTrendStatistics")
            .withUri("/v1/{project_id}/audit/{instance_id}/statistics/trend/sql-count")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSqlTrendStatisticsRequest::getInstanceId,
                CountSqlTrendStatisticsRequest::setInstanceId));
        builder.<GeneralRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GeneralRequest.class),
            f -> f.withMarshaller(CountSqlTrendStatisticsRequest::getBody, CountSqlTrendStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse> createAuditRiskRule =
        genForCreateAuditRiskRule();

    private static HttpRequestDef<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse> genForCreateAuditRiskRule() {
        // basic
        HttpRequestDef.Builder<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuditRiskRuleRequest.class, CreateAuditRiskRuleResponse.class)
                .withName("CreateAuditRiskRule")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/risk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuditRiskRuleRequest::getInstanceId,
                CreateAuditRiskRuleRequest::setInstanceId));
        builder.<RuleAddRiskRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleAddRiskRuleRequest.class),
            f -> f.withMarshaller(CreateAuditRiskRuleRequest::getBody, CreateAuditRiskRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse> createAuditScopeRule =
        genForCreateAuditScopeRule();

    private static HttpRequestDef<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse> genForCreateAuditScopeRule() {
        // basic
        HttpRequestDef.Builder<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuditScopeRuleRequest.class, CreateAuditScopeRuleResponse.class)
            .withName("CreateAuditScopeRule")
            .withUri("/v1/{project_id}/audit/{instance_id}/rule/scopes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuditScopeRuleRequest::getInstanceId,
                CreateAuditScopeRuleRequest::setInstanceId));
        builder.<RuleScopeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleScopeRequest.class),
            f -> f.withMarshaller(CreateAuditScopeRuleRequest::getBody, CreateAuditScopeRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse> createDbEncryptInstancePeriod =
        genForCreateDbEncryptInstancePeriod();

    private static HttpRequestDef<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse> genForCreateDbEncryptInstancePeriod() {
        // basic
        HttpRequestDef.Builder<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDbEncryptInstancePeriodRequest.class,
                    CreateDbEncryptInstancePeriodResponse.class)
                .withName("CreateDbEncryptInstancePeriod")
                .withUri("/v2/{project_id}/db-encrypt/charge/period/order")
                .withContentType("application/json");

        // requests
        builder.<ChargeOrderDbssNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChargeOrderDbssNew.class),
            f -> f.withMarshaller(CreateDbEncryptInstancePeriodRequest::getBody,
                CreateDbEncryptInstancePeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse> createDbOmInstancePeriod =
        genForCreateDbOmInstancePeriod();

    private static HttpRequestDef<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse> genForCreateDbOmInstancePeriod() {
        // basic
        HttpRequestDef.Builder<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDbOmInstancePeriodRequest.class, CreateDbOmInstancePeriodResponse.class)
                .withName("CreateDbOmInstancePeriod")
                .withUri("/v2/{project_id}/db-om/charge/period/order")
                .withContentType("application/json");

        // requests
        builder.<ChargeOrderDbssNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChargeOrderDbssNew.class),
            f -> f.withMarshaller(CreateDbOmInstancePeriodRequest::getBody, CreateDbOmInstancePeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrder =
        genForCreateInstancesPeriodOrder();

    private static HttpRequestDef<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> genForCreateInstancesPeriodOrder() {
        // basic
        HttpRequestDef.Builder<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstancesPeriodOrderRequest.class,
                    CreateInstancesPeriodOrderResponse.class)
                .withName("CreateInstancesPeriodOrder")
                .withUri("/v2/{project_id}/dbss/audit/charge/period/order")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstancePeriodRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstancePeriodRequest.class),
            f -> f.withMarshaller(CreateInstancesPeriodOrderRequest::getBody,
                CreateInstancesPeriodOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse> createInstancesPeriodOrderNew =
        genForCreateInstancesPeriodOrderNew();

    private static HttpRequestDef<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse> genForCreateInstancesPeriodOrderNew() {
        // basic
        HttpRequestDef.Builder<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstancesPeriodOrderNewRequest.class,
                    CreateInstancesPeriodOrderNewResponse.class)
                .withName("CreateInstancesPeriodOrderNew")
                .withUri("/v2/{project_id}/audit/charge/period/order")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstancePeriodRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstancePeriodRequest.class),
            f -> f.withMarshaller(CreateInstancesPeriodOrderNewRequest::getBody,
                CreateInstancesPeriodOrderNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportRequest, CreateReportResponse> createReport = genForCreateReport();

    private static HttpRequestDef<CreateReportRequest, CreateReportResponse> genForCreateReport() {
        // basic
        HttpRequestDef.Builder<CreateReportRequest, CreateReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReportRequest.class, CreateReportResponse.class)
                .withName("CreateReport")
                .withUri("/v1/{project_id}/audit/{instance_id}/reports/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportRequest::getInstanceId, CreateReportRequest::setInstanceId));
        builder.<CreateReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReportRequestBody.class),
            f -> f.withMarshaller(CreateReportRequest::getBody, CreateReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse> createSensitiveMaskRule =
        genForCreateSensitiveMaskRule();

    private static HttpRequestDef<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse> genForCreateSensitiveMaskRule() {
        // basic
        HttpRequestDef.Builder<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSensitiveMaskRuleRequest.class, CreateSensitiveMaskRuleResponse.class)
            .withName("CreateSensitiveMaskRule")
            .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSensitiveMaskRuleRequest::getInstanceId,
                CreateSensitiveMaskRuleRequest::setInstanceId));
        builder.<MaskRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaskRuleRequest.class),
            f -> f.withMarshaller(CreateSensitiveMaskRuleRequest::getBody, CreateSensitiveMaskRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditAgentRequest, DeleteAuditAgentResponse> deleteAuditAgent =
        genForDeleteAuditAgent();

    private static HttpRequestDef<DeleteAuditAgentRequest, DeleteAuditAgentResponse> genForDeleteAuditAgent() {
        // basic
        HttpRequestDef.Builder<DeleteAuditAgentRequest, DeleteAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditAgentRequest.class, DeleteAuditAgentResponse.class)
                .withName("DeleteAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getInstanceId, DeleteAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getAgentId, DeleteAuditAgentRequest::setAgentId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getDbId, DeleteAuditAgentRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse> deleteAuditAlarmLog =
        genForDeleteAuditAlarmLog();

    private static HttpRequestDef<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse> genForDeleteAuditAlarmLog() {
        // basic
        HttpRequestDef.Builder<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditAlarmLogRequest.class, DeleteAuditAlarmLogResponse.class)
            .withName("DeleteAuditAlarmLog")
            .withUri("/v1/{project_id}/audit/{instance_id}/alarm-log/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAlarmLogRequest::getInstanceId,
                DeleteAuditAlarmLogRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAlarmLogRequest::getId, DeleteAuditAlarmLogRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse> deleteAuditBackupTask =
        genForDeleteAuditBackupTask();

    private static HttpRequestDef<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse> genForDeleteAuditBackupTask() {
        // basic
        HttpRequestDef.Builder<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditBackupTaskRequest.class, DeleteAuditBackupTaskResponse.class)
            .withName("DeleteAuditBackupTask")
            .withUri("/v1/{project_id}/audit/{instance_id}/backups/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditBackupTaskRequest::getInstanceId,
                DeleteAuditBackupTaskRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditBackupTaskRequest::getId, DeleteAuditBackupTaskRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> deleteAuditDatabase =
        genForDeleteAuditDatabase();

    private static HttpRequestDef<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> genForDeleteAuditDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditDatabaseRequest.class, DeleteAuditDatabaseResponse.class)
            .withName("DeleteAuditDatabase")
            .withUri("/v2/{project_id}/{instance_id}/audit/databases/{db_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseRequest::getInstanceId,
                DeleteAuditDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseRequest::getDbId, DeleteAuditDatabaseRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse> deleteAuditDatabaseNew =
        genForDeleteAuditDatabaseNew();

    private static HttpRequestDef<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse> genForDeleteAuditDatabaseNew() {
        // basic
        HttpRequestDef.Builder<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditDatabaseNewRequest.class, DeleteAuditDatabaseNewResponse.class)
            .withName("DeleteAuditDatabaseNew")
            .withUri("/v3/{project_id}/audit/{instance_id}/databases/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseNewRequest::getInstanceId,
                DeleteAuditDatabaseNewRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseNewRequest::getId, DeleteAuditDatabaseNewRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditReportRequest, DeleteAuditReportResponse> deleteAuditReport =
        genForDeleteAuditReport();

    private static HttpRequestDef<DeleteAuditReportRequest, DeleteAuditReportResponse> genForDeleteAuditReport() {
        // basic
        HttpRequestDef.Builder<DeleteAuditReportRequest, DeleteAuditReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditReportRequest.class, DeleteAuditReportResponse.class)
                .withName("DeleteAuditReport")
                .withUri("/v1/{project_id}/audit/{instance_id}/reports/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditReportRequest::getInstanceId, DeleteAuditReportRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditReportRequest::getId, DeleteAuditReportRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse> deleteAuditRuleRisk =
        genForDeleteAuditRuleRisk();

    private static HttpRequestDef<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse> genForDeleteAuditRuleRisk() {
        // basic
        HttpRequestDef.Builder<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditRuleRiskRequest.class, DeleteAuditRuleRiskResponse.class)
            .withName("DeleteAuditRuleRisk")
            .withUri("/v1/{project_id}/audit/{instance_id}/rule/risk/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditRuleRiskRequest::getInstanceId,
                DeleteAuditRuleRiskRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditRuleRiskRequest::getId, DeleteAuditRuleRiskRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditScopeRequest, DeleteAuditScopeResponse> deleteAuditScope =
        genForDeleteAuditScope();

    private static HttpRequestDef<DeleteAuditScopeRequest, DeleteAuditScopeResponse> genForDeleteAuditScope() {
        // basic
        HttpRequestDef.Builder<DeleteAuditScopeRequest, DeleteAuditScopeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditScopeRequest.class, DeleteAuditScopeResponse.class)
                .withName("DeleteAuditScope")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/scopes/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditScopeRequest::getInstanceId, DeleteAuditScopeRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditScopeRequest::getId, DeleteAuditScopeRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse> deleteDbEncryptInstance =
        genForDeleteDbEncryptInstance();

    private static HttpRequestDef<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse> genForDeleteDbEncryptInstance() {
        // basic
        HttpRequestDef.Builder<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDbEncryptInstanceRequest.class, DeleteDbEncryptInstanceResponse.class)
            .withName("DeleteDbEncryptInstance")
            .withUri("/v1/{project_id}/db-encrypt/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbEncryptInstanceRequest::getInstanceId,
                DeleteDbEncryptInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse> deleteDbOmInstance =
        genForDeleteDbOmInstance();

    private static HttpRequestDef<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse> genForDeleteDbOmInstance() {
        // basic
        HttpRequestDef.Builder<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbOmInstanceRequest.class, DeleteDbOmInstanceResponse.class)
                .withName("DeleteDbOmInstance")
                .withUri("/v1/{project_id}/db-om/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbOmInstanceRequest::getInstanceId, DeleteDbOmInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstances =
        genForDeleteInstances();

    private static HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> genForDeleteInstances() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesRequest, DeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstancesRequest.class, DeleteInstancesResponse.class)
                .withName("DeleteInstances")
                .withUri("/v1/{project_id}/dbss/audit/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteInstanceDemandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceDemandRequest.class),
            f -> f.withMarshaller(DeleteInstancesRequest::getBody, DeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesNewRequest, DeleteInstancesNewResponse> deleteInstancesNew =
        genForDeleteInstancesNew();

    private static HttpRequestDef<DeleteInstancesNewRequest, DeleteInstancesNewResponse> genForDeleteInstancesNew() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesNewRequest, DeleteInstancesNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstancesNewRequest.class, DeleteInstancesNewResponse.class)
                .withName("DeleteInstancesNew")
                .withUri("/v1/{project_id}/audit/instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteInstanceDemandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceDemandRequest.class),
            f -> f.withMarshaller(DeleteInstancesNewRequest::getBody, DeleteInstancesNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse> deleteSensitiveRules =
        genForDeleteSensitiveRules();

    private static HttpRequestDef<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse> genForDeleteSensitiveRules() {
        // basic
        HttpRequestDef.Builder<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSensitiveRulesRequest.class, DeleteSensitiveRulesResponse.class)
            .withName("DeleteSensitiveRules")
            .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/rule/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSensitiveRulesRequest::getInstanceId,
                DeleteSensitiveRulesRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSensitiveRulesRequest::getId, DeleteSensitiveRulesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAuditAgentRequest, DownloadAuditAgentResponse> downloadAuditAgent =
        genForDownloadAuditAgent();

    private static HttpRequestDef<DownloadAuditAgentRequest, DownloadAuditAgentResponse> genForDownloadAuditAgent() {
        // basic
        HttpRequestDef.Builder<DownloadAuditAgentRequest, DownloadAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAuditAgentRequest.class, DownloadAuditAgentResponse.class)
                .withName("DownloadAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentRequest::getInstanceId, DownloadAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentRequest::getAgentId, DownloadAuditAgentRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAuditReportRequest, DownloadAuditReportResponse> downloadAuditReport =
        genForDownloadAuditReport();

    private static HttpRequestDef<DownloadAuditReportRequest, DownloadAuditReportResponse> genForDownloadAuditReport() {
        // basic
        HttpRequestDef.Builder<DownloadAuditReportRequest, DownloadAuditReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAuditReportRequest.class, DownloadAuditReportResponse.class)
                .withName("DownloadAuditReport")
                .withUri("/v1/{project_id}/audit/{instance_id}/reports/{id}/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditReportRequest::getInstanceId,
                DownloadAuditReportRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditReportRequest::getId, DownloadAuditReportRequest::setId));
        builder.<String>withRequestField("local",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditReportRequest::getLocal, DownloadAuditReportRequest::setLocal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfo =
        genForListAlarmTopicConfigInfo();

    private static HttpRequestDef<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> genForListAlarmTopicConfigInfo() {
        // basic
        HttpRequestDef.Builder<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAlarmTopicConfigInfoRequest.class, ListAlarmTopicConfigInfoResponse.class)
                .withName("ListAlarmTopicConfigInfo")
                .withUri("/v1/{project_id}/{instance_id}/audit/alarm/topic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTopicConfigInfoRequest::getInstanceId,
                ListAlarmTopicConfigInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse> listAlarmTopicConfigInfoNew =
        genForListAlarmTopicConfigInfoNew();

    private static HttpRequestDef<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse> genForListAlarmTopicConfigInfoNew() {
        // basic
        HttpRequestDef.Builder<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAlarmTopicConfigInfoNewRequest.class,
                    ListAlarmTopicConfigInfoNewResponse.class)
                .withName("ListAlarmTopicConfigInfoNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/alarm/topic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTopicConfigInfoNewRequest::getInstanceId,
                ListAlarmTopicConfigInfoNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAgentRequest, ListAuditAgentResponse> listAuditAgent =
        genForListAuditAgent();

    private static HttpRequestDef<ListAuditAgentRequest, ListAuditAgentResponse> genForListAuditAgent() {
        // basic
        HttpRequestDef.Builder<ListAuditAgentRequest, ListAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditAgentRequest.class, ListAuditAgentResponse.class)
                .withName("ListAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getInstanceId, ListAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getDbId, ListAuditAgentRequest::setDbId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getOffset, ListAuditAgentRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getLimit, ListAuditAgentRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> listAuditAlarmLog =
        genForListAuditAlarmLog();

    private static HttpRequestDef<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> genForListAuditAlarmLog() {
        // basic
        HttpRequestDef.Builder<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditAlarmLogRequest.class, ListAuditAlarmLogResponse.class)
                .withName("ListAuditAlarmLog")
                .withUri("/v1/{project_id}/{instance_id}/audit/alarm-log")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAlarmLogRequest::getInstanceId, ListAuditAlarmLogRequest::setInstanceId));
        builder.<AlarmLogRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmLogRequest.class),
            f -> f.withMarshaller(ListAuditAlarmLogRequest::getBody, ListAuditAlarmLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse> listAuditAlarmLogNew =
        genForListAuditAlarmLogNew();

    private static HttpRequestDef<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse> genForListAuditAlarmLogNew() {
        // basic
        HttpRequestDef.Builder<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAuditAlarmLogNewRequest.class, ListAuditAlarmLogNewResponse.class)
            .withName("ListAuditAlarmLogNew")
            .withUri("/v2/{project_id}/audit/{instance_id}/alarm-log")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAlarmLogNewRequest::getInstanceId,
                ListAuditAlarmLogNewRequest::setInstanceId));
        builder.<AlarmLogRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmLogRequest.class),
            f -> f.withMarshaller(ListAuditAlarmLogNewRequest::getBody, ListAuditAlarmLogNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse> listAuditBackupInfo =
        genForListAuditBackupInfo();

    private static HttpRequestDef<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse> genForListAuditBackupInfo() {
        // basic
        HttpRequestDef.Builder<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditBackupInfoRequest.class, ListAuditBackupInfoResponse.class)
                .withName("ListAuditBackupInfo")
                .withUri("/v2/{project_id}/audit/{instance_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditBackupInfoRequest::getInstanceId,
                ListAuditBackupInfoRequest::setInstanceId));
        builder.<BackupPageRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupPageRequest.class),
            f -> f.withMarshaller(ListAuditBackupInfoRequest::getBody, ListAuditBackupInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse> listAuditBackupRiskTemplates =
        genForListAuditBackupRiskTemplates();

    private static HttpRequestDef<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse> genForListAuditBackupRiskTemplates() {
        // basic
        HttpRequestDef.Builder<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuditBackupRiskTemplatesRequest.class,
                    ListAuditBackupRiskTemplatesResponse.class)
                .withName("ListAuditBackupRiskTemplates")
                .withUri("/v1/{project_id}/audit/{instance_id}/backup/risk/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditBackupRiskTemplatesRequest::getInstanceId,
                ListAuditBackupRiskTemplatesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabases =
        genForListAuditDatabases();

    private static HttpRequestDef<ListAuditDatabasesRequest, ListAuditDatabasesResponse> genForListAuditDatabases() {
        // basic
        HttpRequestDef.Builder<ListAuditDatabasesRequest, ListAuditDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditDatabasesRequest.class, ListAuditDatabasesResponse.class)
                .withName("ListAuditDatabases")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getInstanceId, ListAuditDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getStatus, ListAuditDatabasesRequest::setStatus));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getOffset, ListAuditDatabasesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getLimit, ListAuditDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse> listAuditDatabasesNew =
        genForListAuditDatabasesNew();

    private static HttpRequestDef<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse> genForListAuditDatabasesNew() {
        // basic
        HttpRequestDef.Builder<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditDatabasesNewRequest.class, ListAuditDatabasesNewResponse.class)
            .withName("ListAuditDatabasesNew")
            .withUri("/v2/{project_id}/audit/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesNewRequest::getInstanceId,
                ListAuditDatabasesNewRequest::setInstanceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesNewRequest::getStatus, ListAuditDatabasesNewRequest::setStatus));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesNewRequest::getOffset, ListAuditDatabasesNewRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesNewRequest::getLimit, ListAuditDatabasesNewRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobs =
        genForListAuditInstanceJobs();

    private static HttpRequestDef<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> genForListAuditInstanceJobs() {
        // basic
        HttpRequestDef.Builder<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditInstanceJobsRequest.class, ListAuditInstanceJobsResponse.class)
            .withName("ListAuditInstanceJobs")
            .withUri("/v1/{project_id}/dbss/audit/jobs/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstanceJobsRequest::getResourceId,
                ListAuditInstanceJobsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse> listAuditInstanceJobsNew =
        genForListAuditInstanceJobsNew();

    private static HttpRequestDef<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse> genForListAuditInstanceJobsNew() {
        // basic
        HttpRequestDef.Builder<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuditInstanceJobsNewRequest.class, ListAuditInstanceJobsNewResponse.class)
                .withName("ListAuditInstanceJobsNew")
                .withUri("/v1/{project_id}/audit/{resource_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstanceJobsNewRequest::getResourceId,
                ListAuditInstanceJobsNewRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstances =
        genForListAuditInstances();

    private static HttpRequestDef<ListAuditInstancesRequest, ListAuditInstancesResponse> genForListAuditInstances() {
        // basic
        HttpRequestDef.Builder<ListAuditInstancesRequest, ListAuditInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditInstancesRequest.class, ListAuditInstancesResponse.class)
                .withName("ListAuditInstances")
                .withUri("/v1/{project_id}/dbss/audit/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesRequest::getOffset, ListAuditInstancesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesRequest::getLimit, ListAuditInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse> listAuditInstancesNew =
        genForListAuditInstancesNew();

    private static HttpRequestDef<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse> genForListAuditInstancesNew() {
        // basic
        HttpRequestDef.Builder<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditInstancesNewRequest.class, ListAuditInstancesNewResponse.class)
            .withName("ListAuditInstancesNew")
            .withUri("/v1/{project_id}/audit/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesNewRequest::getOffset, ListAuditInstancesNewRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesNewRequest::getLimit, ListAuditInstancesNewRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse> listAuditObsBuckets =
        genForListAuditObsBuckets();

    private static HttpRequestDef<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse> genForListAuditObsBuckets() {
        // basic
        HttpRequestDef.Builder<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditObsBucketsRequest.class, ListAuditObsBucketsResponse.class)
                .withName("ListAuditObsBuckets")
                .withUri("/v2/{project_id}/audit/backup/obs-buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogs =
        genForListAuditOperateLogs();

    private static HttpRequestDef<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> genForListAuditOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAuditOperateLogsRequest.class, ListAuditOperateLogsResponse.class)
            .withName("ListAuditOperateLogs")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/operate-log")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditOperateLogsRequest::getInstanceId,
                ListAuditOperateLogsRequest::setInstanceId));
        builder.<OperateLogGetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateLogGetRequest.class),
            f -> f.withMarshaller(ListAuditOperateLogsRequest::getBody, ListAuditOperateLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse> listAuditOperateLogsNew =
        genForListAuditOperateLogsNew();

    private static HttpRequestDef<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse> genForListAuditOperateLogsNew() {
        // basic
        HttpRequestDef.Builder<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAuditOperateLogsNewRequest.class, ListAuditOperateLogsNewResponse.class)
            .withName("ListAuditOperateLogsNew")
            .withUri("/v1/{project_id}/audit/{instance_id}/operation-log")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditOperateLogsNewRequest::getInstanceId,
                ListAuditOperateLogsNewRequest::setInstanceId));
        builder.<OperateLogGetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateLogGetRequest.class),
            f -> f.withMarshaller(ListAuditOperateLogsNewRequest::getBody, ListAuditOperateLogsNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse> listAuditReportTemplates =
        genForListAuditReportTemplates();

    private static HttpRequestDef<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse> genForListAuditReportTemplates() {
        // basic
        HttpRequestDef.Builder<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuditReportTemplatesRequest.class, ListAuditReportTemplatesResponse.class)
                .withName("ListAuditReportTemplates")
                .withUri("/v2/{project_id}/audit/{instance_id}/reports/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditReportTemplatesRequest::getInstanceId,
                ListAuditReportTemplatesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditReportsRequest, ListAuditReportsResponse> listAuditReports =
        genForListAuditReports();

    private static HttpRequestDef<ListAuditReportsRequest, ListAuditReportsResponse> genForListAuditReports() {
        // basic
        HttpRequestDef.Builder<ListAuditReportsRequest, ListAuditReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditReportsRequest.class, ListAuditReportsResponse.class)
                .withName("ListAuditReports")
                .withUri("/v1/{project_id}/audit/{instance_id}/reports/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditReportsRequest::getInstanceId, ListAuditReportsRequest::setInstanceId));
        builder.<ReportGetReportsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportGetReportsRequest.class),
            f -> f.withMarshaller(ListAuditReportsRequest::getBody, ListAuditReportsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisks =
        genForListAuditRuleRisks();

    private static HttpRequestDef<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> genForListAuditRuleRisks() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditRuleRisksRequest.class, ListAuditRuleRisksResponse.class)
                .withName("ListAuditRuleRisks")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/risk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getInstanceId, ListAuditRuleRisksRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getName, ListAuditRuleRisksRequest::setName));
        builder.<ListAuditRuleRisksRequest.RiskLevelsEnum>withRequestField("risk_levels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuditRuleRisksRequest.RiskLevelsEnum.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getRiskLevels, ListAuditRuleRisksRequest::setRiskLevels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse> listAuditRuleRisksNew =
        genForListAuditRuleRisksNew();

    private static HttpRequestDef<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse> genForListAuditRuleRisksNew() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditRuleRisksNewRequest.class, ListAuditRuleRisksNewResponse.class)
            .withName("ListAuditRuleRisksNew")
            .withUri("/v1/{project_id}/audit/{instance_id}/rule/risk")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getInstanceId,
                ListAuditRuleRisksNewRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getName, ListAuditRuleRisksNewRequest::setName));
        builder.<String>withRequestField("risk_levels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getRiskLevels,
                ListAuditRuleRisksNewRequest::setRiskLevels));
        builder.<Boolean>withRequestField("support_db_classify_rule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getSupportDbClassifyRule,
                ListAuditRuleRisksNewRequest::setSupportDbClassifyRule));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getOffset, ListAuditRuleRisksNewRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksNewRequest::getLimit, ListAuditRuleRisksNewRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopes =
        genForListAuditRuleScopes();

    private static HttpRequestDef<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> genForListAuditRuleScopes() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditRuleScopesRequest.class, ListAuditRuleScopesResponse.class)
                .withName("ListAuditRuleScopes")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/scopes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getInstanceId,
                ListAuditRuleScopesRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getOffset, ListAuditRuleScopesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getLimit, ListAuditRuleScopesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse> listAuditRuleScopesNew =
        genForListAuditRuleScopesNew();

    private static HttpRequestDef<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse> genForListAuditRuleScopesNew() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditRuleScopesNewRequest.class, ListAuditRuleScopesNewResponse.class)
            .withName("ListAuditRuleScopesNew")
            .withUri("/v1/{project_id}/audit/{instance_id}/rule/scopes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesNewRequest::getInstanceId,
                ListAuditRuleScopesNewRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesNewRequest::getOffset, ListAuditRuleScopesNewRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesNewRequest::getLimit, ListAuditRuleScopesNewRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasks =
        genForListAuditSensitiveMasks();

    private static HttpRequestDef<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> genForListAuditSensitiveMasks() {
        // basic
        HttpRequestDef.Builder<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditSensitiveMasksRequest.class, ListAuditSensitiveMasksResponse.class)
            .withName("ListAuditSensitiveMasks")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/sensitive/masks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getInstanceId,
                ListAuditSensitiveMasksRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getOffset,
                ListAuditSensitiveMasksRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getLimit, ListAuditSensitiveMasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse> listAuditSensitiveMasksNew =
        genForListAuditSensitiveMasksNew();

    private static HttpRequestDef<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse> genForListAuditSensitiveMasksNew() {
        // basic
        HttpRequestDef.Builder<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuditSensitiveMasksNewRequest.class,
                    ListAuditSensitiveMasksNewResponse.class)
                .withName("ListAuditSensitiveMasksNew")
                .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksNewRequest::getInstanceId,
                ListAuditSensitiveMasksNewRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksNewRequest::getOffset,
                ListAuditSensitiveMasksNewRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksNewRequest::getLimit,
                ListAuditSensitiveMasksNewRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSqlsRequest, ListAuditSqlsResponse> listAuditSqls =
        genForListAuditSqls();

    private static HttpRequestDef<ListAuditSqlsRequest, ListAuditSqlsResponse> genForListAuditSqls() {
        // basic
        HttpRequestDef.Builder<ListAuditSqlsRequest, ListAuditSqlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditSqlsRequest.class, ListAuditSqlsResponse.class)
                .withName("ListAuditSqls")
                .withUri("/v1/{project_id}/{instance_id}/audit/sqls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSqlsRequest::getInstanceId, ListAuditSqlsRequest::setInstanceId));
        builder.<AuditSqlRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditSqlRequest.class),
            f -> f.withMarshaller(ListAuditSqlsRequest::getBody, ListAuditSqlsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse> listAuditSqlsNew =
        genForListAuditSqlsNew();

    private static HttpRequestDef<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse> genForListAuditSqlsNew() {
        // basic
        HttpRequestDef.Builder<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditSqlsNewRequest.class, ListAuditSqlsNewResponse.class)
                .withName("ListAuditSqlsNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/sqls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSqlsNewRequest::getInstanceId, ListAuditSqlsNewRequest::setInstanceId));
        builder.<AuditSqlRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditSqlRequest.class),
            f -> f.withMarshaller(ListAuditSqlsNewRequest::getBody, ListAuditSqlsNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> listAuditSummaryInfos =
        genForListAuditSummaryInfos();

    private static HttpRequestDef<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> genForListAuditSummaryInfos() {
        // basic
        HttpRequestDef.Builder<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditSummaryInfosRequest.class, ListAuditSummaryInfosResponse.class)
            .withName("ListAuditSummaryInfos")
            .withUri("/v2/{project_id}/audit/summary/info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSummaryInfosRequest::getOffset, ListAuditSummaryInfosRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSummaryInfosRequest::getLimit, ListAuditSummaryInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse> listAuditTrendHistory =
        genForListAuditTrendHistory();

    private static HttpRequestDef<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse> genForListAuditTrendHistory() {
        // basic
        HttpRequestDef.Builder<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditTrendHistoryRequest.class, ListAuditTrendHistoryResponse.class)
            .withName("ListAuditTrendHistory")
            .withUri("/v2/{project_id}/audit/{instance_id}/statistics/trend/history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditTrendHistoryRequest::getInstanceId,
                ListAuditTrendHistoryRequest::setInstanceId));

        // response
        builder.<List<TrendStatusResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAuditTrendHistoryResponse::getBody, ListAuditTrendHistoryResponse::setBody)
                .withInnerContainerType(TrendStatusResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfos =
        genForListAvailabilityZoneInfos();

    private static HttpRequestDef<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> genForListAvailabilityZoneInfos() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailabilityZoneInfosRequest.class,
                    ListAvailabilityZoneInfosResponse.class)
                .withName("ListAvailabilityZoneInfos")
                .withUri("/v2/{project_id}/dbss/audit/availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse> listAvailabilityZoneInfosNew =
        genForListAvailabilityZoneInfosNew();

    private static HttpRequestDef<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse> genForListAvailabilityZoneInfosNew() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailabilityZoneInfosNewRequest.class,
                    ListAvailabilityZoneInfosNewResponse.class)
                .withName("ListAvailabilityZoneInfosNew")
                .withUri("/v2/{project_id}/availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse> listDbEncryptInstances =
        genForListDbEncryptInstances();

    private static HttpRequestDef<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse> genForListDbEncryptInstances() {
        // basic
        HttpRequestDef.Builder<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDbEncryptInstancesRequest.class, ListDbEncryptInstancesResponse.class)
            .withName("ListDbEncryptInstances")
            .withUri("/v2/{project_id}/db-encrypt/instances")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecification =
        genForListEcsSpecification();

    private static HttpRequestDef<ListEcsSpecificationRequest, ListEcsSpecificationResponse> genForListEcsSpecification() {
        // basic
        HttpRequestDef.Builder<ListEcsSpecificationRequest, ListEcsSpecificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEcsSpecificationRequest.class, ListEcsSpecificationResponse.class)
            .withName("ListEcsSpecification")
            .withUri("/v1/{project_id}/dbss/audit/specification")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse> listEcsSpecificationNew =
        genForListEcsSpecificationNew();

    private static HttpRequestDef<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse> genForListEcsSpecificationNew() {
        // basic
        HttpRequestDef.Builder<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEcsSpecificationNewRequest.class, ListEcsSpecificationNewResponse.class)
            .withName("ListEcsSpecificationNew")
            .withUri("/v1/{project_id}/audit/specification")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("image_business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEcsSpecificationNewRequest::getImageBusinessType,
                ListEcsSpecificationNewRequest::setImageBusinessType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/db-om/instances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRdsDatabasesRequest, ListRdsDatabasesResponse> listRdsDatabases =
        genForListRdsDatabases();

    private static HttpRequestDef<ListRdsDatabasesRequest, ListRdsDatabasesResponse> genForListRdsDatabases() {
        // basic
        HttpRequestDef.Builder<ListRdsDatabasesRequest, ListRdsDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRdsDatabasesRequest.class, ListRdsDatabasesResponse.class)
                .withName("ListRdsDatabases")
                .withUri("/v2/{project_id}/audit/databases/rds")
                .withContentType("application/json");

        // requests
        builder.<ListRdsDatabasesRequest.DbTypeEnum>withRequestField("db_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRdsDatabasesRequest.DbTypeEnum.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getDbType, ListRdsDatabasesRequest::setDbType));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getOffset, ListRdsDatabasesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getLimit, ListRdsDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRules =
        genForListSqlInjectionRules();

    private static HttpRequestDef<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> genForListSqlInjectionRules() {
        // basic
        HttpRequestDef.Builder<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSqlInjectionRulesRequest.class, ListSqlInjectionRulesResponse.class)
            .withName("ListSqlInjectionRules")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/sql-injections")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlInjectionRulesRequest::getInstanceId,
                ListSqlInjectionRulesRequest::setInstanceId));
        builder.<SqlRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlRuleRequest.class),
            f -> f.withMarshaller(ListSqlInjectionRulesRequest::getBody, ListSqlInjectionRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootAuditInstanceRequest, RebootAuditInstanceResponse> rebootAuditInstance =
        genForRebootAuditInstance();

    private static HttpRequestDef<RebootAuditInstanceRequest, RebootAuditInstanceResponse> genForRebootAuditInstance() {
        // basic
        HttpRequestDef.Builder<RebootAuditInstanceRequest, RebootAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootAuditInstanceRequest.class, RebootAuditInstanceResponse.class)
                .withName("RebootAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/reboot")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(RebootAuditInstanceRequest::getBody, RebootAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse> rebootAuditInstanceNew =
        genForRebootAuditInstanceNew();

    private static HttpRequestDef<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse> genForRebootAuditInstanceNew() {
        // basic
        HttpRequestDef.Builder<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RebootAuditInstanceNewRequest.class, RebootAuditInstanceNewResponse.class)
            .withName("RebootAuditInstanceNew")
            .withUri("/v1/{project_id}/audit/instance/reboot")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(RebootAuditInstanceNewRequest::getBody, RebootAuditInstanceNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse> rebootDbEncryptInstance =
        genForRebootDbEncryptInstance();

    private static HttpRequestDef<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse> genForRebootDbEncryptInstance() {
        // basic
        HttpRequestDef.Builder<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RebootDbEncryptInstanceRequest.class, RebootDbEncryptInstanceResponse.class)
            .withName("RebootDbEncryptInstance")
            .withUri("/v1/{project_id}/db-encrypt/{instance_id}/reboot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootDbEncryptInstanceRequest::getInstanceId,
                RebootDbEncryptInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse> rebootDbOmInstance =
        genForRebootDbOmInstance();

    private static HttpRequestDef<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse> genForRebootDbOmInstance() {
        // basic
        HttpRequestDef.Builder<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootDbOmInstanceRequest.class, RebootDbOmInstanceResponse.class)
                .withName("RebootDbOmInstance")
                .withUri("/v1/{project_id}/db-om/{instance_id}/reboot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootDbOmInstanceRequest::getInstanceId, RebootDbOmInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse> resetDbEncryptPassword =
        genForResetDbEncryptPassword();

    private static HttpRequestDef<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse> genForResetDbEncryptPassword() {
        // basic
        HttpRequestDef.Builder<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetDbEncryptPasswordRequest.class, ResetDbEncryptPasswordResponse.class)
            .withName("ResetDbEncryptPassword")
            .withUri("/v1/{project_id}/db-encrypt/{instance_id}/password/reset")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDbEncryptPasswordRequest::getInstanceId,
                ResetDbEncryptPasswordRequest::setInstanceId));
        builder.<ChangePasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordRequest.class),
            f -> f.withMarshaller(ResetDbEncryptPasswordRequest::getBody, ResetDbEncryptPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse> resetDbOmPassword =
        genForResetDbOmPassword();

    private static HttpRequestDef<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse> genForResetDbOmPassword() {
        // basic
        HttpRequestDef.Builder<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetDbOmPasswordRequest.class, ResetDbOmPasswordResponse.class)
                .withName("ResetDbOmPassword")
                .withUri("/v1/{project_id}/db-om/{instance_id}/password/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDbOmPasswordRequest::getInstanceId, ResetDbOmPasswordRequest::setInstanceId));
        builder.<ChangePasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordRequest.class),
            f -> f.withMarshaller(ResetDbOmPasswordRequest::getBody, ResetDbOmPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreAuditBackupRequest, RestoreAuditBackupResponse> restoreAuditBackup =
        genForRestoreAuditBackup();

    private static HttpRequestDef<RestoreAuditBackupRequest, RestoreAuditBackupResponse> genForRestoreAuditBackup() {
        // basic
        HttpRequestDef.Builder<RestoreAuditBackupRequest, RestoreAuditBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreAuditBackupRequest.class, RestoreAuditBackupResponse.class)
                .withName("RestoreAuditBackup")
                .withUri("/v1/{project_id}/audit/{instance_id}/backup/{id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAuditBackupRequest::getInstanceId, RestoreAuditBackupRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAuditBackupRequest::getId, RestoreAuditBackupRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse> retryAuditBackupTask =
        genForRetryAuditBackupTask();

    private static HttpRequestDef<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse> genForRetryAuditBackupTask() {
        // basic
        HttpRequestDef.Builder<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RetryAuditBackupTaskRequest.class, RetryAuditBackupTaskResponse.class)
            .withName("RetryAuditBackupTask")
            .withUri("/v1/{project_id}/audit/{instance_id}/backup/{id}/retry")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryAuditBackupTaskRequest::getInstanceId,
                RetryAuditBackupTaskRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryAuditBackupTaskRequest::getId, RetryAuditBackupTaskRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfo =
        genForSetAlarmTopicConfigInfo();

    private static HttpRequestDef<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> genForSetAlarmTopicConfigInfo() {
        // basic
        HttpRequestDef.Builder<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetAlarmTopicConfigInfoRequest.class, SetAlarmTopicConfigInfoResponse.class)
            .withName("SetAlarmTopicConfigInfo")
            .withUri("/v1/{project_id}/{instance_id}/audit/alarm/topic")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoRequest::getInstanceId,
                SetAlarmTopicConfigInfoRequest::setInstanceId));
        builder.<ConfigAlarmTopicRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigAlarmTopicRequest.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoRequest::getBody, SetAlarmTopicConfigInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse> setAlarmTopicConfigInfoNew =
        genForSetAlarmTopicConfigInfoNew();

    private static HttpRequestDef<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse> genForSetAlarmTopicConfigInfoNew() {
        // basic
        HttpRequestDef.Builder<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetAlarmTopicConfigInfoNewRequest.class,
                    SetAlarmTopicConfigInfoNewResponse.class)
                .withName("SetAlarmTopicConfigInfoNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/alarm/topic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoNewRequest::getInstanceId,
                SetAlarmTopicConfigInfoNewRequest::setInstanceId));
        builder.<ConfigAlarmTopicRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigAlarmTopicRequest.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoNewRequest::getBody,
                SetAlarmTopicConfigInfoNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse> setAuditAlarmLogStatus =
        genForSetAuditAlarmLogStatus();

    private static HttpRequestDef<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse> genForSetAuditAlarmLogStatus() {
        // basic
        HttpRequestDef.Builder<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetAuditAlarmLogStatusRequest.class, SetAuditAlarmLogStatusResponse.class)
            .withName("SetAuditAlarmLogStatus")
            .withUri("/v1/{project_id}/audit/{instance_id}/alarm-log/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditAlarmLogStatusRequest::getInstanceId,
                SetAuditAlarmLogStatusRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditAlarmLogStatusRequest::getId, SetAuditAlarmLogStatusRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse> setAuditAutoBackupTemplate =
        genForSetAuditAutoBackupTemplate();

    private static HttpRequestDef<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse> genForSetAuditAutoBackupTemplate() {
        // basic
        HttpRequestDef.Builder<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SetAuditAutoBackupTemplateRequest.class,
                    SetAuditAutoBackupTemplateResponse.class)
                .withName("SetAuditAutoBackupTemplate")
                .withUri("/v1/{project_id}/audit/{instance_id}/backup/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditAutoBackupTemplateRequest::getInstanceId,
                SetAuditAutoBackupTemplateRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse> setAuditBackupRiskSwitch =
        genForSetAuditBackupRiskSwitch();

    private static HttpRequestDef<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse> genForSetAuditBackupRiskSwitch() {
        // basic
        HttpRequestDef.Builder<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetAuditBackupRiskSwitchRequest.class, SetAuditBackupRiskSwitchResponse.class)
                .withName("SetAuditBackupRiskSwitch")
                .withUri("/v1/{domain_id}/audit/{instance_id}/backup/risk/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditBackupRiskSwitchRequest::getDomainId,
                SetAuditBackupRiskSwitchRequest::setDomainId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditBackupRiskSwitchRequest::getInstanceId,
                SetAuditBackupRiskSwitchRequest::setInstanceId));
        builder.<RiskBackupTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RiskBackupTemplate.class),
            f -> f.withMarshaller(SetAuditBackupRiskSwitchRequest::getBody, SetAuditBackupRiskSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse> setAuditBackupSwitch =
        genForSetAuditBackupSwitch();

    private static HttpRequestDef<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse> genForSetAuditBackupSwitch() {
        // basic
        HttpRequestDef.Builder<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetAuditBackupSwitchRequest.class, SetAuditBackupSwitchResponse.class)
            .withName("SetAuditBackupSwitch")
            .withUri("/v1/{domain_id}/audit/{instance_id}/backup/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditBackupSwitchRequest::getDomainId, SetAuditBackupSwitchRequest::setDomainId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditBackupSwitchRequest::getInstanceId,
                SetAuditBackupSwitchRequest::setInstanceId));
        builder.<BackupSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupSwitchRequest.class),
            f -> f.withMarshaller(SetAuditBackupSwitchRequest::getBody, SetAuditBackupSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse> setAuditInstanceTimeZone =
        genForSetAuditInstanceTimeZone();

    private static HttpRequestDef<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse> genForSetAuditInstanceTimeZone() {
        // basic
        HttpRequestDef.Builder<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetAuditInstanceTimeZoneRequest.class, SetAuditInstanceTimeZoneResponse.class)
                .withName("SetAuditInstanceTimeZone")
                .withUri("/v1/{project_id}/audit/{instance_id}/timezone")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditInstanceTimeZoneRequest::getInstanceId,
                SetAuditInstanceTimeZoneRequest::setInstanceId));
        builder.<TimezoneRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TimezoneRequest.class),
            f -> f.withMarshaller(SetAuditInstanceTimeZoneRequest::getBody, SetAuditInstanceTimeZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse> setAuditScopeRuleSwitch =
        genForSetAuditScopeRuleSwitch();

    private static HttpRequestDef<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse> genForSetAuditScopeRuleSwitch() {
        // basic
        HttpRequestDef.Builder<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetAuditScopeRuleSwitchRequest.class, SetAuditScopeRuleSwitchResponse.class)
            .withName("SetAuditScopeRuleSwitch")
            .withUri("/v2/{project_id}/audit/{instance_id}/rule/scopes/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditScopeRuleSwitchRequest::getInstanceId,
                SetAuditScopeRuleSwitchRequest::setInstanceId));
        builder.<AuditScopeSwitchRequestNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditScopeSwitchRequestNew.class),
            f -> f.withMarshaller(SetAuditScopeRuleSwitchRequest::getBody, SetAuditScopeRuleSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse> setRiskOperationPolicy =
        genForSetRiskOperationPolicy();

    private static HttpRequestDef<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse> genForSetRiskOperationPolicy() {
        // basic
        HttpRequestDef.Builder<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetRiskOperationPolicyRequest.class, SetRiskOperationPolicyResponse.class)
            .withName("SetRiskOperationPolicy")
            .withUri("/v2/{project_id}/audit/{instance_id}/rule/risk/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRiskOperationPolicyRequest::getInstanceId,
                SetRiskOperationPolicyRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRiskOperationPolicyRequest::getId, SetRiskOperationPolicyRequest::setId));
        builder.<RuleAddRiskRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleAddRiskRuleRequest.class),
            f -> f.withMarshaller(SetRiskOperationPolicyRequest::getBody, SetRiskOperationPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRiskRuleRankRequest, SetRiskRuleRankResponse> setRiskRuleRank =
        genForSetRiskRuleRank();

    private static HttpRequestDef<SetRiskRuleRankRequest, SetRiskRuleRankResponse> genForSetRiskRuleRank() {
        // basic
        HttpRequestDef.Builder<SetRiskRuleRankRequest, SetRiskRuleRankResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetRiskRuleRankRequest.class, SetRiskRuleRankResponse.class)
                .withName("SetRiskRuleRank")
                .withUri("/v2/{project_id}/audit/{instance_id}/rule/risk/rank")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRiskRuleRankRequest::getInstanceId, SetRiskRuleRankRequest::setInstanceId));
        builder.<RankRiskRuleNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RankRiskRuleNew.class),
            f -> f.withMarshaller(SetRiskRuleRankRequest::getBody, SetRiskRuleRankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse> setSensitiveMaskRuleSwitch =
        genForSetSensitiveMaskRuleSwitch();

    private static HttpRequestDef<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse> genForSetSensitiveMaskRuleSwitch() {
        // basic
        HttpRequestDef.Builder<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetSensitiveMaskRuleSwitchRequest.class,
                    SetSensitiveMaskRuleSwitchResponse.class)
                .withName("SetSensitiveMaskRuleSwitch")
                .withUri("/v2/{project_id}/audit/{instance_id}/sensitive/mask/rule/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveMaskRuleSwitchRequest::getInstanceId,
                SetSensitiveMaskRuleSwitchRequest::setInstanceId));
        builder.<BatchSwitchesRequestNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchesRequestNew.class),
            f -> f.withMarshaller(SetSensitiveMaskRuleSwitchRequest::getBody,
                SetSensitiveMaskRuleSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse> setSensitiveResultSwitch =
        genForSetSensitiveResultSwitch();

    private static HttpRequestDef<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse> genForSetSensitiveResultSwitch() {
        // basic
        HttpRequestDef.Builder<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetSensitiveResultSwitchRequest.class, SetSensitiveResultSwitchResponse.class)
                .withName("SetSensitiveResultSwitch")
                .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/result/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveResultSwitchRequest::getInstanceId,
                SetSensitiveResultSwitchRequest::setInstanceId));
        builder.<SwitchStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchStatus.class),
            f -> f.withMarshaller(SetSensitiveResultSwitchRequest::getBody, SetSensitiveResultSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse> setSensitiveSwitch =
        genForSetSensitiveSwitch();

    private static HttpRequestDef<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse> genForSetSensitiveSwitch() {
        // basic
        HttpRequestDef.Builder<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetSensitiveSwitchRequest.class, SetSensitiveSwitchResponse.class)
                .withName("SetSensitiveSwitch")
                .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSwitchRequest::getInstanceId, SetSensitiveSwitchRequest::setInstanceId));
        builder.<SwitchStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchStatus.class),
            f -> f.withMarshaller(SetSensitiveSwitchRequest::getBody, SetSensitiveSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse> showAuditBackRiskTemplate =
        genForShowAuditBackRiskTemplate();

    private static HttpRequestDef<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse> genForShowAuditBackRiskTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuditBackRiskTemplateRequest.class,
                    ShowAuditBackRiskTemplateResponse.class)
                .withName("ShowAuditBackRiskTemplate")
                .withUri("/v1/{project_id}/audit/{instance_id}/backup/risk/template/{db_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditBackRiskTemplateRequest::getInstanceId,
                ShowAuditBackRiskTemplateRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditBackRiskTemplateRequest::getDbId,
                ShowAuditBackRiskTemplateRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse> showAuditBackupStatus =
        genForShowAuditBackupStatus();

    private static HttpRequestDef<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse> genForShowAuditBackupStatus() {
        // basic
        HttpRequestDef.Builder<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuditBackupStatusRequest.class, ShowAuditBackupStatusResponse.class)
            .withName("ShowAuditBackupStatus")
            .withUri("/v1/{project_id}/audit/{instance_id}/backup/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditBackupStatusRequest::getInstanceId,
                ShowAuditBackupStatusRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuota =
        genForShowAuditQuota();

    private static HttpRequestDef<ShowAuditQuotaRequest, ShowAuditQuotaResponse> genForShowAuditQuota() {
        // basic
        HttpRequestDef.Builder<ShowAuditQuotaRequest, ShowAuditQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditQuotaRequest.class, ShowAuditQuotaResponse.class)
                .withName("ShowAuditQuota")
                .withUri("/v1/{project_id}/dbss/audit/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse> showAuditQuotaNew =
        genForShowAuditQuotaNew();

    private static HttpRequestDef<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse> genForShowAuditQuotaNew() {
        // basic
        HttpRequestDef.Builder<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditQuotaNewRequest.class, ShowAuditQuotaNewResponse.class)
                .withName("ShowAuditQuotaNew")
                .withUri("/v2/{project_id}/audit/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRisk =
        genForShowAuditRuleRisk();

    private static HttpRequestDef<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> genForShowAuditRuleRisk() {
        // basic
        HttpRequestDef.Builder<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditRuleRiskRequest.class, ShowAuditRuleRiskResponse.class)
                .withName("ShowAuditRuleRisk")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/risk/{risk_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskRequest::getInstanceId, ShowAuditRuleRiskRequest::setInstanceId));
        builder.<String>withRequestField("risk_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskRequest::getRiskId, ShowAuditRuleRiskRequest::setRiskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse> showAuditRuleRiskNew =
        genForShowAuditRuleRiskNew();

    private static HttpRequestDef<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse> genForShowAuditRuleRiskNew() {
        // basic
        HttpRequestDef.Builder<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuditRuleRiskNewRequest.class, ShowAuditRuleRiskNewResponse.class)
            .withName("ShowAuditRuleRiskNew")
            .withUri("/v2/{project_id}/audit/{instance_id}/rule/risk/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskNewRequest::getInstanceId,
                ShowAuditRuleRiskNewRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskNewRequest::getId, ShowAuditRuleRiskNewRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse> showAuditStatistics =
        genForShowAuditStatistics();

    private static HttpRequestDef<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse> genForShowAuditStatistics() {
        // basic
        HttpRequestDef.Builder<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditStatisticsRequest.class, ShowAuditStatisticsResponse.class)
                .withName("ShowAuditStatistics")
                .withUri("/v1/{project_id}/audit/summary/risk/statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse> showAuditTaskStatus =
        genForShowAuditTaskStatus();

    private static HttpRequestDef<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse> genForShowAuditTaskStatus() {
        // basic
        HttpRequestDef.Builder<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditTaskStatusRequest.class, ShowAuditTaskStatusResponse.class)
                .withName("ShowAuditTaskStatus")
                .withUri("/v3/{project_id}/audit/summary/{busi_type}/task-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("busi_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditTaskStatusRequest::getBusiType, ShowAuditTaskStatusRequest::setBusiType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse> showAuditTopicReportSchedulerConfig =
        genForShowAuditTopicReportSchedulerConfig();

    private static HttpRequestDef<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse> genForShowAuditTopicReportSchedulerConfig() {
        // basic
        HttpRequestDef.Builder<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuditTopicReportSchedulerConfigRequest.class,
                    ShowAuditTopicReportSchedulerConfigResponse.class)
                .withName("ShowAuditTopicReportSchedulerConfig")
                .withUri("/v2/{project_id}/audit/{instance_id}/reports/tasks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditTopicReportSchedulerConfigRequest::getInstanceId,
                ShowAuditTopicReportSchedulerConfigRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditTopicReportSchedulerConfigRequest::getId,
                ShowAuditTopicReportSchedulerConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse> showAuditUpgradeStatus =
        genForShowAuditUpgradeStatus();

    private static HttpRequestDef<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse> genForShowAuditUpgradeStatus() {
        // basic
        HttpRequestDef.Builder<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuditUpgradeStatusRequest.class, ShowAuditUpgradeStatusResponse.class)
            .withName("ShowAuditUpgradeStatus")
            .withUri("/v1/{project_id}/audit/upgrade/status")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse> showBackupRiskBucketPath =
        genForShowBackupRiskBucketPath();

    private static HttpRequestDef<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse> genForShowBackupRiskBucketPath() {
        // basic
        HttpRequestDef.Builder<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBackupRiskBucketPathRequest.class, ShowBackupRiskBucketPathResponse.class)
                .withName("ShowBackupRiskBucketPath")
                .withUri("/v1/{project_id}/audit/{instance_id}/backup/risk/bucket-path")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRiskBucketPathRequest::getInstanceId,
                ShowBackupRiskBucketPathRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse> showInstanceMonitorInfo =
        genForShowInstanceMonitorInfo();

    private static HttpRequestDef<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse> genForShowInstanceMonitorInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowInstanceMonitorInfoRequest.class, ShowInstanceMonitorInfoResponse.class)
            .withName("ShowInstanceMonitorInfo")
            .withUri("/v1/{project_id}/audit/{instance_id}/system/monitorinfo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorInfoRequest::getInstanceId,
                ShowInstanceMonitorInfoRequest::setInstanceId));
        builder.<MonitorInfoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MonitorInfoRequest.class),
            f -> f.withMarshaller(ShowInstanceMonitorInfoRequest::getBody, ShowInstanceMonitorInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse> showInstanceQuota =
        genForShowInstanceQuota();

    private static HttpRequestDef<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse> genForShowInstanceQuota() {
        // basic
        HttpRequestDef.Builder<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceQuotaRequest.class, ShowInstanceQuotaResponse.class)
                .withName("ShowInstanceQuota")
                .withUri("/v1/{project_id}/instance/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse> showSensitiveMaskSwitch =
        genForShowSensitiveMaskSwitch();

    private static HttpRequestDef<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse> genForShowSensitiveMaskSwitch() {
        // basic
        HttpRequestDef.Builder<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSensitiveMaskSwitchRequest.class, ShowSensitiveMaskSwitchResponse.class)
            .withName("ShowSensitiveMaskSwitch")
            .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSensitiveMaskSwitchRequest::getInstanceId,
                ShowSensitiveMaskSwitchRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse> showSensitiveResultSwitch =
        genForShowSensitiveResultSwitch();

    private static HttpRequestDef<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse> genForShowSensitiveResultSwitch() {
        // basic
        HttpRequestDef.Builder<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSensitiveResultSwitchRequest.class,
                    ShowSensitiveResultSwitchResponse.class)
                .withName("ShowSensitiveResultSwitch")
                .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/result/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSensitiveResultSwitchRequest::getInstanceId,
                ShowSensitiveResultSwitchRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerVersionRequest, ShowServerVersionResponse> showServerVersion =
        genForShowServerVersion();

    private static HttpRequestDef<ShowServerVersionRequest, ShowServerVersionResponse> genForShowServerVersion() {
        // basic
        HttpRequestDef.Builder<ShowServerVersionRequest, ShowServerVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerVersionRequest.class, ShowServerVersionResponse.class)
                .withName("ShowServerVersion")
                .withUri("/v1/{project_id}/version")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlDetailRequest, ShowSqlDetailResponse> showSqlDetail =
        genForShowSqlDetail();

    private static HttpRequestDef<ShowSqlDetailRequest, ShowSqlDetailResponse> genForShowSqlDetail() {
        // basic
        HttpRequestDef.Builder<ShowSqlDetailRequest, ShowSqlDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlDetailRequest.class, ShowSqlDetailResponse.class)
                .withName("ShowSqlDetail")
                .withUri("/v2/{project_id}/audit/{instance_id}/sqls/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlDetailRequest::getInstanceId, ShowSqlDetailRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlDetailRequest::getId, ShowSqlDetailRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAuditInstanceRequest, StartAuditInstanceResponse> startAuditInstance =
        genForStartAuditInstance();

    private static HttpRequestDef<StartAuditInstanceRequest, StartAuditInstanceResponse> genForStartAuditInstance() {
        // basic
        HttpRequestDef.Builder<StartAuditInstanceRequest, StartAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAuditInstanceRequest.class, StartAuditInstanceResponse.class)
                .withName("StartAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StartAuditInstanceRequest::getBody, StartAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse> startAuditInstanceNew =
        genForStartAuditInstanceNew();

    private static HttpRequestDef<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse> genForStartAuditInstanceNew() {
        // basic
        HttpRequestDef.Builder<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartAuditInstanceNewRequest.class, StartAuditInstanceNewResponse.class)
            .withName("StartAuditInstanceNew")
            .withUri("/v1/{project_id}/audit/instance/start")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StartAuditInstanceNewRequest::getBody, StartAuditInstanceNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse> startDbEncryptInstance =
        genForStartDbEncryptInstance();

    private static HttpRequestDef<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse> genForStartDbEncryptInstance() {
        // basic
        HttpRequestDef.Builder<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartDbEncryptInstanceRequest.class, StartDbEncryptInstanceResponse.class)
            .withName("StartDbEncryptInstance")
            .withUri("/v1/{project_id}/db-encrypt/{instance_id}/start")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDbEncryptInstanceRequest::getInstanceId,
                StartDbEncryptInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDbOmInstanceRequest, StartDbOmInstanceResponse> startDbOmInstance =
        genForStartDbOmInstance();

    private static HttpRequestDef<StartDbOmInstanceRequest, StartDbOmInstanceResponse> genForStartDbOmInstance() {
        // basic
        HttpRequestDef.Builder<StartDbOmInstanceRequest, StartDbOmInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartDbOmInstanceRequest.class, StartDbOmInstanceResponse.class)
                .withName("StartDbOmInstance")
                .withUri("/v1/{project_id}/db-om/{instance_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDbOmInstanceRequest::getInstanceId, StartDbOmInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAuditInstanceRequest, StopAuditInstanceResponse> stopAuditInstance =
        genForStopAuditInstance();

    private static HttpRequestDef<StopAuditInstanceRequest, StopAuditInstanceResponse> genForStopAuditInstance() {
        // basic
        HttpRequestDef.Builder<StopAuditInstanceRequest, StopAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopAuditInstanceRequest.class, StopAuditInstanceResponse.class)
                .withName("StopAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/stop")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StopAuditInstanceRequest::getBody, StopAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse> stopAuditInstanceNew =
        genForStopAuditInstanceNew();

    private static HttpRequestDef<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse> genForStopAuditInstanceNew() {
        // basic
        HttpRequestDef.Builder<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StopAuditInstanceNewRequest.class, StopAuditInstanceNewResponse.class)
            .withName("StopAuditInstanceNew")
            .withUri("/v1/{project_id}/audit/instance/stop")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StopAuditInstanceNewRequest::getBody, StopAuditInstanceNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse> stopDbEncryptInstance =
        genForStopDbEncryptInstance();

    private static HttpRequestDef<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse> genForStopDbEncryptInstance() {
        // basic
        HttpRequestDef.Builder<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StopDbEncryptInstanceRequest.class, StopDbEncryptInstanceResponse.class)
            .withName("StopDbEncryptInstance")
            .withUri("/v1/{project_id}/db-encrypt/{instance_id}/stop")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopDbEncryptInstanceRequest::getInstanceId,
                StopDbEncryptInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopDbOmInstanceRequest, StopDbOmInstanceResponse> stopDbOmInstance =
        genForStopDbOmInstance();

    private static HttpRequestDef<StopDbOmInstanceRequest, StopDbOmInstanceResponse> genForStopDbOmInstance() {
        // basic
        HttpRequestDef.Builder<StopDbOmInstanceRequest, StopDbOmInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopDbOmInstanceRequest.class, StopDbOmInstanceResponse.class)
                .withName("StopDbOmInstance")
                .withUri("/v1/{project_id}/db-om/{instance_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopDbOmInstanceRequest::getInstanceId, StopDbOmInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> switchAgent = genForSwitchAgent();

    private static HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> genForSwitchAgent() {
        // basic
        HttpRequestDef.Builder<SwitchAgentRequest, SwitchAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAgentRequest.class, SwitchAgentResponse.class)
                .withName("SwitchAgent")
                .withUri("/v1/{project_id}/{instance_id}/audit/agent/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAgentRequest::getInstanceId, SwitchAgentRequest::setInstanceId));
        builder.<AgentSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentSwitchRequest.class),
            f -> f.withMarshaller(SwitchAgentRequest::getBody, SwitchAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> switchAuditDatabase =
        genForSwitchAuditDatabase();

    private static HttpRequestDef<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> genForSwitchAuditDatabase() {
        // basic
        HttpRequestDef.Builder<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAuditDatabaseRequest.class, SwitchAuditDatabaseResponse.class)
                .withName("SwitchAuditDatabase")
                .withUri("/v2/{project_id}/{instance_id}/audit/databases/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAuditDatabaseRequest::getInstanceId,
                SwitchAuditDatabaseRequest::setInstanceId));
        builder.<SwitchAuditDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAuditDbRequest.class),
            f -> f.withMarshaller(SwitchAuditDatabaseRequest::getBody, SwitchAuditDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse> switchAuditDatabaseNew =
        genForSwitchAuditDatabaseNew();

    private static HttpRequestDef<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse> genForSwitchAuditDatabaseNew() {
        // basic
        HttpRequestDef.Builder<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchAuditDatabaseNewRequest.class, SwitchAuditDatabaseNewResponse.class)
            .withName("SwitchAuditDatabaseNew")
            .withUri("/v3/{project_id}/audit/{instance_id}/databases/switch")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAuditDatabaseNewRequest::getInstanceId,
                SwitchAuditDatabaseNewRequest::setInstanceId));
        builder.<SwitchAuditDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAuditDbRequest.class),
            f -> f.withMarshaller(SwitchAuditDatabaseNewRequest::getBody, SwitchAuditDatabaseNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRule =
        genForSwitchRiskRule();

    private static HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> genForSwitchRiskRule() {
        // basic
        HttpRequestDef.Builder<SwitchRiskRuleRequest, SwitchRiskRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchRiskRuleRequest.class, SwitchRiskRuleResponse.class)
                .withName("SwitchRiskRule")
                .withUri("/v1/{project_id}/{instance_id}/audit/rule/risk/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getInstanceId, SwitchRiskRuleRequest::setInstanceId));
        builder.<BatchSwitchesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchesRequest.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getBody, SwitchRiskRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse> switchRiskRuleNew =
        genForSwitchRiskRuleNew();

    private static HttpRequestDef<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse> genForSwitchRiskRuleNew() {
        // basic
        HttpRequestDef.Builder<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchRiskRuleNewRequest.class, SwitchRiskRuleNewResponse.class)
                .withName("SwitchRiskRuleNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/rule/risk/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRiskRuleNewRequest::getInstanceId, SwitchRiskRuleNewRequest::setInstanceId));
        builder.<BatchSwitchesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchesRequest.class),
            f -> f.withMarshaller(SwitchRiskRuleNewRequest::getBody, SwitchRiskRuleNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse> unbindDbEncryptEip =
        genForUnbindDbEncryptEip();

    private static HttpRequestDef<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse> genForUnbindDbEncryptEip() {
        // basic
        HttpRequestDef.Builder<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindDbEncryptEipRequest.class, UnbindDbEncryptEipResponse.class)
                .withName("UnbindDbEncryptEip")
                .withUri("/v1/{project_id}/db-encrypt/{instance_id}/eip/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindDbEncryptEipRequest::getInstanceId, UnbindDbEncryptEipRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindDbOmEipRequest, UnbindDbOmEipResponse> unbindDbOmEip =
        genForUnbindDbOmEip();

    private static HttpRequestDef<UnbindDbOmEipRequest, UnbindDbOmEipResponse> genForUnbindDbOmEip() {
        // basic
        HttpRequestDef.Builder<UnbindDbOmEipRequest, UnbindDbOmEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindDbOmEipRequest.class, UnbindDbOmEipResponse.class)
                .withName("UnbindDbOmEip")
                .withUri("/v1/{project_id}/db-om/{instance_id}/eip/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindDbOmEipRequest::getInstanceId, UnbindDbOmEipRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> updateAuditInstance =
        genForUpdateAuditInstance();

    private static HttpRequestDef<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> genForUpdateAuditInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuditInstanceRequest.class, UpdateAuditInstanceResponse.class)
                .withName("UpdateAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditInstanceRequest::getInstanceId,
                UpdateAuditInstanceRequest::setInstanceId));
        builder.<UpdateAuditBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuditBean.class),
            f -> f.withMarshaller(UpdateAuditInstanceRequest::getBody, UpdateAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse> updateAuditInstanceNew =
        genForUpdateAuditInstanceNew();

    private static HttpRequestDef<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse> genForUpdateAuditInstanceNew() {
        // basic
        HttpRequestDef.Builder<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAuditInstanceNewRequest.class, UpdateAuditInstanceNewResponse.class)
            .withName("UpdateAuditInstanceNew")
            .withUri("/v1/{project_id}/audit/instance/{instance_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditInstanceNewRequest::getInstanceId,
                UpdateAuditInstanceNewRequest::setInstanceId));
        builder.<UpdateAuditBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuditBean.class),
            f -> f.withMarshaller(UpdateAuditInstanceNewRequest::getBody, UpdateAuditInstanceNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse> updateAuditRiskBucketPath =
        genForUpdateAuditRiskBucketPath();

    private static HttpRequestDef<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse> genForUpdateAuditRiskBucketPath() {
        // basic
        HttpRequestDef.Builder<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAuditRiskBucketPathRequest.class,
                    UpdateAuditRiskBucketPathResponse.class)
                .withName("UpdateAuditRiskBucketPath")
                .withUri("/v1/{domain_id}/audit/{instance_id}/backup/risk/global/bucket-path")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditRiskBucketPathRequest::getDomainId,
                UpdateAuditRiskBucketPathRequest::setDomainId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditRiskBucketPathRequest::getInstanceId,
                UpdateAuditRiskBucketPathRequest::setInstanceId));
        builder.<RiskBackupConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RiskBackupConfig.class),
            f -> f.withMarshaller(UpdateAuditRiskBucketPathRequest::getBody,
                UpdateAuditRiskBucketPathRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse> updateAuditScopeRule =
        genForUpdateAuditScopeRule();

    private static HttpRequestDef<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse> genForUpdateAuditScopeRule() {
        // basic
        HttpRequestDef.Builder<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAuditScopeRuleRequest.class, UpdateAuditScopeRuleResponse.class)
            .withName("UpdateAuditScopeRule")
            .withUri("/v3/{project_id}/audit/{instance_id}/rule/scopes/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditScopeRuleRequest::getInstanceId,
                UpdateAuditScopeRuleRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditScopeRuleRequest::getId, UpdateAuditScopeRuleRequest::setId));
        builder.<RuleScopeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleScopeRequest.class),
            f -> f.withMarshaller(UpdateAuditScopeRuleRequest::getBody, UpdateAuditScopeRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroup =
        genForUpdateAuditSecurityGroup();

    private static HttpRequestDef<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> genForUpdateAuditSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateAuditSecurityGroupRequest.class, UpdateAuditSecurityGroupResponse.class)
                .withName("UpdateAuditSecurityGroup")
                .withUri("/v1/{project_id}/dbss/audit/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateAuditSecurityGroupRequest::getBody, UpdateAuditSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse> updateAuditSecurityGroupNew =
        genForUpdateAuditSecurityGroupNew();

    private static HttpRequestDef<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse> genForUpdateAuditSecurityGroupNew() {
        // basic
        HttpRequestDef.Builder<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAuditSecurityGroupNewRequest.class,
                    UpdateAuditSecurityGroupNewResponse.class)
                .withName("UpdateAuditSecurityGroupNew")
                .withUri("/v1/{project_id}/audit/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateAuditSecurityGroupNewRequest::getBody,
                UpdateAuditSecurityGroupNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse> updateAuditTaskStatus =
        genForUpdateAuditTaskStatus();

    private static HttpRequestDef<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse> genForUpdateAuditTaskStatus() {
        // basic
        HttpRequestDef.Builder<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAuditTaskStatusRequest.class, UpdateAuditTaskStatusResponse.class)
            .withName("UpdateAuditTaskStatus")
            .withUri("/v1/{project_id}/audit/summary/{busi_type}/task-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("busi_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditTaskStatusRequest::getBusiType,
                UpdateAuditTaskStatusRequest::setBusiType));
        builder.<AuditSummaryStatusRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditSummaryStatusRequest.class),
            f -> f.withMarshaller(UpdateAuditTaskStatusRequest::getBody, UpdateAuditTaskStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse> updateAuditTopicReportSchedulerConfig =
        genForUpdateAuditTopicReportSchedulerConfig();

    private static HttpRequestDef<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse> genForUpdateAuditTopicReportSchedulerConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAuditTopicReportSchedulerConfigRequest.class,
                    UpdateAuditTopicReportSchedulerConfigResponse.class)
                .withName("UpdateAuditTopicReportSchedulerConfig")
                .withUri("/v1/{project_id}/audit/{instance_id}/reports/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditTopicReportSchedulerConfigRequest::getInstanceId,
                UpdateAuditTopicReportSchedulerConfigRequest::setInstanceId));
        builder.<ConfigReportTopicRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigReportTopicRequest.class),
            f -> f.withMarshaller(UpdateAuditTopicReportSchedulerConfigRequest::getBody,
                UpdateAuditTopicReportSchedulerConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse> updateDbEncryptInstanceName =
        genForUpdateDbEncryptInstanceName();

    private static HttpRequestDef<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse> genForUpdateDbEncryptInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDbEncryptInstanceNameRequest.class,
                    UpdateDbEncryptInstanceNameResponse.class)
                .withName("UpdateDbEncryptInstanceName")
                .withUri("/v1/{project_id}/db-encrypt/{instance_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbEncryptInstanceNameRequest::getInstanceId,
                UpdateDbEncryptInstanceNameRequest::setInstanceId));
        builder.<ChangeNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeNameRequest.class),
            f -> f.withMarshaller(UpdateDbEncryptInstanceNameRequest::getBody,
                UpdateDbEncryptInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse> updateDbOmInstanceName =
        genForUpdateDbOmInstanceName();

    private static HttpRequestDef<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse> genForUpdateDbOmInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDbOmInstanceNameRequest.class, UpdateDbOmInstanceNameResponse.class)
            .withName("UpdateDbOmInstanceName")
            .withUri("/v1/{project_id}/db-om/{instance_id}/name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbOmInstanceNameRequest::getInstanceId,
                UpdateDbOmInstanceNameRequest::setInstanceId));
        builder.<ChangeNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeNameRequest.class),
            f -> f.withMarshaller(UpdateDbOmInstanceNameRequest::getBody, UpdateDbOmInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse> updateSensitiveMaskRule =
        genForUpdateSensitiveMaskRule();

    private static HttpRequestDef<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse> genForUpdateSensitiveMaskRule() {
        // basic
        HttpRequestDef.Builder<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSensitiveMaskRuleRequest.class, UpdateSensitiveMaskRuleResponse.class)
            .withName("UpdateSensitiveMaskRule")
            .withUri("/v1/{project_id}/audit/{instance_id}/sensitive/mask/rule/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSensitiveMaskRuleRequest::getInstanceId,
                UpdateSensitiveMaskRuleRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSensitiveMaskRuleRequest::getId, UpdateSensitiveMaskRuleRequest::setId));
        builder.<MaskRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaskRuleRequest.class),
            f -> f.withMarshaller(UpdateSensitiveMaskRuleRequest::getBody, UpdateSensitiveMaskRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse> uploadAuditDbConfig =
        genForUploadAuditDbConfig();

    private static HttpRequestDef<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse> genForUploadAuditDbConfig() {
        // basic
        HttpRequestDef.Builder<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAuditDbConfigRequest.class, UploadAuditDbConfigResponse.class)
                .withName("UploadAuditDbConfig")
                .withUri("/v1/{project_id}/audit/databases/configs/obs-upload")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAuditAgentNewRequest, AddAuditAgentNewResponse> addAuditAgentNew =
        genForAddAuditAgentNew();

    private static HttpRequestDef<AddAuditAgentNewRequest, AddAuditAgentNewResponse> genForAddAuditAgentNew() {
        // basic
        HttpRequestDef.Builder<AddAuditAgentNewRequest, AddAuditAgentNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditAgentNewRequest.class, AddAuditAgentNewResponse.class)
                .withName("AddAuditAgentNew")
                .withUri("/v3/{project_id}/audit/{instance_id}/agents")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditAgentNewRequest::getInstanceId, AddAuditAgentNewRequest::setInstanceId));
        builder.<AuditAgentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditAgentRequest.class),
            f -> f.withMarshaller(AddAuditAgentNewRequest::getBody, AddAuditAgentNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse> createAuditDbAgent =
        genForCreateAuditDbAgent();

    private static HttpRequestDef<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse> genForCreateAuditDbAgent() {
        // basic
        HttpRequestDef.Builder<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuditDbAgentRequest.class, CreateAuditDbAgentResponse.class)
                .withName("CreateAuditDbAgent")
                .withUri("/v2/{project_id}/audit/{instance_id}/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuditDbAgentRequest::getInstanceId, CreateAuditDbAgentRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuditDbAgentRequest::getAgentId, CreateAuditDbAgentRequest::setAgentId));
        builder.<AgentEditRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentEditRequest.class),
            f -> f.withMarshaller(CreateAuditDbAgentRequest::getBody, CreateAuditDbAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse> deleteAuditAgentNew =
        genForDeleteAuditAgentNew();

    private static HttpRequestDef<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse> genForDeleteAuditAgentNew() {
        // basic
        HttpRequestDef.Builder<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditAgentNewRequest.class, DeleteAuditAgentNewResponse.class)
            .withName("DeleteAuditAgentNew")
            .withUri("/v3/{project_id}/audit/{instance_id}/agents/{agent_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentNewRequest::getInstanceId,
                DeleteAuditAgentNewRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentNewRequest::getAgentId, DeleteAuditAgentNewRequest::setAgentId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentNewRequest::getDbId, DeleteAuditAgentNewRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse> downloadAuditAgentNew =
        genForDownloadAuditAgentNew();

    private static HttpRequestDef<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse> genForDownloadAuditAgentNew() {
        // basic
        HttpRequestDef.Builder<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadAuditAgentNewRequest.class, DownloadAuditAgentNewResponse.class)
            .withName("DownloadAuditAgentNew")
            .withUri("/v2/{project_id}/audit/{instance_id}/agents/{agent_id}/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentNewRequest::getInstanceId,
                DownloadAuditAgentNewRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentNewRequest::getAgentId, DownloadAuditAgentNewRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAgentNewRequest, ListAuditAgentNewResponse> listAuditAgentNew =
        genForListAuditAgentNew();

    private static HttpRequestDef<ListAuditAgentNewRequest, ListAuditAgentNewResponse> genForListAuditAgentNew() {
        // basic
        HttpRequestDef.Builder<ListAuditAgentNewRequest, ListAuditAgentNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditAgentNewRequest.class, ListAuditAgentNewResponse.class)
                .withName("ListAuditAgentNew")
                .withUri("/v3/{project_id}/audit/{instance_id}/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentNewRequest::getInstanceId, ListAuditAgentNewRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentNewRequest::getDbId, ListAuditAgentNewRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAgentNewRequest, SwitchAgentNewResponse> switchAgentNew =
        genForSwitchAgentNew();

    private static HttpRequestDef<SwitchAgentNewRequest, SwitchAgentNewResponse> genForSwitchAgentNew() {
        // basic
        HttpRequestDef.Builder<SwitchAgentNewRequest, SwitchAgentNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAgentNewRequest.class, SwitchAgentNewResponse.class)
                .withName("SwitchAgentNew")
                .withUri("/v2/{project_id}/audit/{instance_id}/agent/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAgentNewRequest::getInstanceId, SwitchAgentNewRequest::setInstanceId));
        builder.<AgentSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentSwitchRequest.class),
            f -> f.withMarshaller(SwitchAgentNewRequest::getBody, SwitchAgentNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse> batchAddAuditWhitelist =
        genForBatchAddAuditWhitelist();

    private static HttpRequestDef<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse> genForBatchAddAuditWhitelist() {
        // basic
        HttpRequestDef.Builder<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddAuditWhitelistRequest.class, BatchAddAuditWhitelistResponse.class)
            .withName("BatchAddAuditWhitelist")
            .withUri("/v1/{project_id}/audit/{instance_id}/whitelists")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAuditWhitelistRequest::getInstanceId,
                BatchAddAuditWhitelistRequest::setInstanceId));
        builder.<AddWhitelistRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddWhitelistRequest.class),
            f -> f.withMarshaller(BatchAddAuditWhitelistRequest::getBody, BatchAddAuditWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse> createAuditSqlRule =
        genForCreateAuditSqlRule();

    private static HttpRequestDef<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse> genForCreateAuditSqlRule() {
        // basic
        HttpRequestDef.Builder<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuditSqlRuleRequest.class, CreateAuditSqlRuleResponse.class)
                .withName("CreateAuditSqlRule")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/sql")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuditSqlRuleRequest::getInstanceId, CreateAuditSqlRuleRequest::setInstanceId));
        builder.<RuleAddSqlRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleAddSqlRequest.class),
            f -> f.withMarshaller(CreateAuditSqlRuleRequest::getBody, CreateAuditSqlRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse> deleteAuditRuleSql =
        genForDeleteAuditRuleSql();

    private static HttpRequestDef<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse> genForDeleteAuditRuleSql() {
        // basic
        HttpRequestDef.Builder<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditRuleSqlRequest.class, DeleteAuditRuleSqlResponse.class)
                .withName("DeleteAuditRuleSql")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/sql/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditRuleSqlRequest::getInstanceId, DeleteAuditRuleSqlRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditRuleSqlRequest::getId, DeleteAuditRuleSqlRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse> deleteAuditWhitelist =
        genForDeleteAuditWhitelist();

    private static HttpRequestDef<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse> genForDeleteAuditWhitelist() {
        // basic
        HttpRequestDef.Builder<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAuditWhitelistRequest.class, DeleteAuditWhitelistResponse.class)
            .withName("DeleteAuditWhitelist")
            .withUri("/v1/{project_id}/audit/{instance_id}/whitelists/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditWhitelistRequest::getInstanceId,
                DeleteAuditWhitelistRequest::setInstanceId));
        builder.<WhitelistBatchDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WhitelistBatchDeleteRequest.class),
            f -> f.withMarshaller(DeleteAuditWhitelistRequest::getBody, DeleteAuditWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse> listSqlInjectionRulesNew =
        genForListSqlInjectionRulesNew();

    private static HttpRequestDef<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse> genForListSqlInjectionRulesNew() {
        // basic
        HttpRequestDef.Builder<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListSqlInjectionRulesNewRequest.class, ListSqlInjectionRulesNewResponse.class)
                .withName("ListSqlInjectionRulesNew")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/sqls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlInjectionRulesNewRequest::getInstanceId,
                ListSqlInjectionRulesNewRequest::setInstanceId));
        builder.<SqlRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlRuleRequest.class),
            f -> f.withMarshaller(ListSqlInjectionRulesNewRequest::getBody, ListSqlInjectionRulesNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelists =
        genForListWhitelists();

    private static HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> genForListWhitelists() {
        // basic
        HttpRequestDef.Builder<ListWhitelistsRequest, ListWhitelistsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWhitelistsRequest.class, ListWhitelistsResponse.class)
                .withName("ListWhitelists")
                .withUri("/v1/{project_id}/audit/{instance_id}/whitelists")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getInstanceId, ListWhitelistsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getOffset, ListWhitelistsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getLimit, ListWhitelistsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse> setAuditSqlRuleSwitch =
        genForSetAuditSqlRuleSwitch();

    private static HttpRequestDef<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse> genForSetAuditSqlRuleSwitch() {
        // basic
        HttpRequestDef.Builder<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetAuditSqlRuleSwitchRequest.class, SetAuditSqlRuleSwitchResponse.class)
            .withName("SetAuditSqlRuleSwitch")
            .withUri("/v2/{project_id}/audit/{instance_id}/rule/sql/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditSqlRuleSwitchRequest::getInstanceId,
                SetAuditSqlRuleSwitchRequest::setInstanceId));
        builder.<RuleSqlIdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleSqlIdRequest.class),
            f -> f.withMarshaller(SetAuditSqlRuleSwitchRequest::getBody, SetAuditSqlRuleSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSqlRuleRankRequest, SetSqlRuleRankResponse> setSqlRuleRank =
        genForSetSqlRuleRank();

    private static HttpRequestDef<SetSqlRuleRankRequest, SetSqlRuleRankResponse> genForSetSqlRuleRank() {
        // basic
        HttpRequestDef.Builder<SetSqlRuleRankRequest, SetSqlRuleRankResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetSqlRuleRankRequest.class, SetSqlRuleRankResponse.class)
                .withName("SetSqlRuleRank")
                .withUri("/v2/{project_id}/audit/{instance_id}/rule/sql/rank")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlRuleRankRequest::getInstanceId, SetSqlRuleRankRequest::setInstanceId));
        builder.<RuleSqlIdsRequestNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleSqlIdsRequestNew.class),
            f -> f.withMarshaller(SetSqlRuleRankRequest::getBody, SetSqlRuleRankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse> updateAuditSqlRule =
        genForUpdateAuditSqlRule();

    private static HttpRequestDef<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse> genForUpdateAuditSqlRule() {
        // basic
        HttpRequestDef.Builder<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAuditSqlRuleRequest.class, UpdateAuditSqlRuleResponse.class)
                .withName("UpdateAuditSqlRule")
                .withUri("/v1/{project_id}/audit/{instance_id}/rule/sql/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditSqlRuleRequest::getInstanceId, UpdateAuditSqlRuleRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditSqlRuleRequest::getId, UpdateAuditSqlRuleRequest::setId));
        builder.<RuleAddSqlRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleAddSqlRequest.class),
            f -> f.withMarshaller(UpdateAuditSqlRuleRequest::getBody, UpdateAuditSqlRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse> updateAuditWhitelist =
        genForUpdateAuditWhitelist();

    private static HttpRequestDef<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse> genForUpdateAuditWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAuditWhitelistRequest.class, UpdateAuditWhitelistResponse.class)
            .withName("UpdateAuditWhitelist")
            .withUri("/v1/{project_id}/audit/{instance_id}/whitelists/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditWhitelistRequest::getInstanceId,
                UpdateAuditWhitelistRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditWhitelistRequest::getId, UpdateAuditWhitelistRequest::setId));
        builder.<UpdateWhitelistRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhitelistRequest.class),
            f -> f.withMarshaller(UpdateAuditWhitelistRequest::getBody, UpdateAuditWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTag =
        genForBatchAddResourceTag();

    private static HttpRequestDef<BatchAddResourceTagRequest, BatchAddResourceTagResponse> genForBatchAddResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchAddResourceTagRequest, BatchAddResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddResourceTagRequest.class, BatchAddResourceTagResponse.class)
                .withName("BatchAddResourceTag")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAddResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getResourceType,
                BatchAddResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getResourceId,
                BatchAddResourceTagRequest::setResourceId));
        builder.<ResourceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequest.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getBody, BatchAddResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTag =
        genForBatchDeleteResourceTag();

    private static HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> genForBatchDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteResourceTagRequest.class, BatchDeleteResourceTagResponse.class)
            .withName("BatchDeleteResourceTag")
            .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceType,
                BatchDeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceId,
                BatchDeleteResourceTagRequest::setResourceId));
        builder.<ResourceTagDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagDeleteRequest.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getBody, BatchDeleteResourceTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteResourceTagResponse::getBody, BatchDeleteResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTag =
        genForCountResourceInstanceByTag();

    private static HttpRequestDef<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> genForCountResourceInstanceByTag() {
        // basic
        HttpRequestDef.Builder<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountResourceInstanceByTagRequest.class,
                    CountResourceInstanceByTagResponse.class)
                .withName("CountResourceInstanceByTag")
                .withUri("/v1/{project_id}/{resource_type}/resource-instances/count")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CountResourceInstanceByTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CountResourceInstanceByTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CountResourceInstanceByTagRequest::getResourceType,
                CountResourceInstanceByTagRequest::setResourceType));
        builder.<ResourceInstanceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceTagRequest.class),
            f -> f.withMarshaller(CountResourceInstanceByTagRequest::getBody,
                CountResourceInstanceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditTagsRequest, ListAuditTagsResponse> listAuditTags =
        genForListAuditTags();

    private static HttpRequestDef<ListAuditTagsRequest, ListAuditTagsResponse> genForListAuditTags() {
        // basic
        HttpRequestDef.Builder<ListAuditTagsRequest, ListAuditTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditTagsRequest.class, ListAuditTagsResponse.class)
                .withName("ListAuditTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditTagsRequest::getResourceType, ListAuditTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditTagsRequest::getResourceId, ListAuditTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTags =
        genForListProjectResourceTags();

    private static HttpRequestDef<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> genForListProjectResourceTags() {
        // basic
        HttpRequestDef.Builder<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectResourceTagsRequest.class, ListProjectResourceTagsResponse.class)
            .withName("ListProjectResourceTags")
            .withUri("/v1/{project_id}/{resource_type}/tags")
            .withContentType("application/json");

        // requests
        builder.<ListProjectResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectResourceTagsRequest::getResourceType,
                ListProjectResourceTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTag =
        genForListResourceInstanceByTag();

    private static HttpRequestDef<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> genForListResourceInstanceByTag() {
        // basic
        HttpRequestDef.Builder<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListResourceInstanceByTagRequest.class,
                    ListResourceInstanceByTagResponse.class)
                .withName("ListResourceInstanceByTag")
                .withUri("/v1/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListResourceInstanceByTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstanceByTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getResourceType,
                ListResourceInstanceByTagRequest::setResourceType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getLimit,
                ListResourceInstanceByTagRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getOffset,
                ListResourceInstanceByTagRequest::setOffset));
        builder.<ResourceInstanceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceTagRequest.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getBody,
                ListResourceInstanceByTagRequest::setBody));

        // response

        return builder.build();
    }

}
