/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2013 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * General Purpose Database Portlet was developed by Advance,Inc.
 * http://www.a-dvance.co.jp/
 */

package com.aimluck.eip.modules.screens;

import net.sf.json.JSONArray;

import org.apache.jetspeed.services.logging.JetspeedLogFactoryService;
import org.apache.jetspeed.services.logging.JetspeedLogger;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;

import com.aimluck.eip.common.ALEipConstants;
import com.aimluck.eip.gpdb.GpdbKubunChangeTurnFormData;

/**
 *
 */
public class GpdbKubunChangeTurnFormJSONScreen extends ALJSONScreen {

  /** logger */
  private static final JetspeedLogger logger = JetspeedLogFactoryService
    .getLogger(GpdbKubunChangeTurnFormJSONScreen.class.getName());

  @Override
  protected String getJSONString(RunData rundata, Context context)
      throws Exception {
    String result = new JSONArray().toString();
    String mode = this.getMode();
    try {
      if (ALEipConstants.MODE_UPDATE.equals(mode)) {
        GpdbKubunChangeTurnFormData formData =
          new GpdbKubunChangeTurnFormData();
        formData.initField();
        if (formData.doUpdate(this, rundata, context)) {
        } else {
          JSONArray json =
            JSONArray
              .fromObject(context.get(ALEipConstants.ERROR_MESSAGE_LIST));
          result = json.toString();
        }
      }

    } catch (Exception e) {
      logger.error("["
        + GpdbKubunChangeTurnFormJSONScreen.class.toString()
        + "]", e);
    }

    return result;
  }
}