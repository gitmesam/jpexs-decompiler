/*
 *  Copyright (C) 2010-2021 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. */
package com.jpexs.decompiler.graph.model;

import com.jpexs.decompiler.graph.GraphTargetItem;
import java.util.List;

/**
 *
 * @author JPEXS
 */
public interface BinaryOp {

    public GraphTargetItem getLeftSide();

    public GraphTargetItem getRightSide();

    public void setLeftSide(GraphTargetItem value);

    public void setRightSide(GraphTargetItem value);

    public int getPrecedence();

    public List<GraphTargetItem> getAllSubItems();
}
