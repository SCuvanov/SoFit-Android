package com.scuvanov.sofit.view.siv.path;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


import android.content.Context;
import com.scuvanov.sofit.view.siv.path.parser.IoUtil;
import com.scuvanov.sofit.view.siv.path.parser.PathInfo;
import com.scuvanov.sofit.view.siv.path.parser.SvgToPath;

public class SvgUtil {
    private static final Map<Integer, PathInfo> PATH_MAP = new ConcurrentHashMap<Integer, PathInfo>();

    public static final PathInfo readSvg(Context context, int resId) {
        PathInfo pathInfo = PATH_MAP.get(resId);
        if(pathInfo == null) {
            InputStream is = null;
            try {
                is = context.getResources().openRawResource(resId);
                pathInfo = SvgToPath.getSVGFromInputStream(is);
                PATH_MAP.put(resId, pathInfo);
            } finally {
                IoUtil.closeQuitely(is);
            }
        }

        return pathInfo;
    }
}
