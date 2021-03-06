/**
*  This file is part of FNLP (formerly FudanNLP).
*  
*  FNLP is free software: you can redistribute it and/or modify
*  it under the terms of the GNU Lesser General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*  
*  FNLP is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU Lesser General Public License for more details.
*  
*  You should have received a copy of the GNU General Public License
*  along with FudanNLP.  If not, see <http://www.gnu.org/licenses/>.
*  
*  Copyright 2009-2014 www.fnlp.org. All rights reserved. 
*/

package org.fnlp.data.reader;

import java.util.List;

import org.fnlp.ml.types.Instance;

public class ListReader extends Reader{

	//测试指代消解临时写的   jszhao
	List<String>[] data;
	int index;

	public ListReader (List<String>[] data)
	{
		this.data = data;
		this.index = 0;
	}

	public Instance next ()
	{
		return new Instance (data[index++], null);
	}

	public boolean hasNext ()	{	return index < data.length;	}
	
	
}