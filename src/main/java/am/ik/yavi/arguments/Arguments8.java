/*
 * Copyright (C) 2018-2020 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.arguments;

/**
 * Generated by https://github.com/making/yavi/blob/develop/scripts/generate-args.sh
 *
 * @since 0.3.0
 */
public class Arguments8<A1, A2, A3, A4, A5, A6, A7, A8>
		extends Arguments7<A1, A2, A3, A4, A5, A6, A7> {

	protected final A8 arg8;

	Arguments8(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8) {
		super(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		this.arg8 = arg8;
	}

	public final A8 arg8() {
		return this.arg8;
	}

	public final <X> X map(Arguments8.Mapper<A1, A2, A3, A4, A5, A6, A7, A8, X> mapper) {
		return mapper.map(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public interface Mapper<A1, A2, A3, A4, A5, A6, A7, A8, X> {
		X map(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8);
	}
}
